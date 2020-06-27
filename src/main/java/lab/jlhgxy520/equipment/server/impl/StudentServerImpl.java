package lab.jlhgxy520.equipment.server.impl;

import com.alibaba.fastjson.JSONObject;
import lab.jlhgxy520.equipment.client.EquData;
import lab.jlhgxy520.equipment.po.EquipmentData;
import lab.jlhgxy520.equipment.dao.EquDataDao;
import lab.jlhgxy520.equipment.dao.EquipmentDao;
import lab.jlhgxy520.equipment.dao.LaboratoryDao;
import lab.jlhgxy520.equipment.po.Equipment;
import lab.jlhgxy520.equipment.po.EquipmentState;
import lab.jlhgxy520.equipment.po.Laboratory;
import lab.jlhgxy520.equipment.server.StudentServer;
import lab.jlhgxy520.equipment.socket.ClientDevice;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServerImpl implements StudentServer {
    @Autowired
    private EquipmentDao equipmentDao;
    @Autowired
    private LaboratoryDao laboratoryDao;
    @Autowired
    private EquDataDao equDataDao;

    @Override
    public Map<String, String> getClassState(String studentId) {
        Map<String, String> map = new HashMap<>();
        Equipment equipment = equipmentDao.selectEuipmentByStudentId(studentId);
        if (equipment==null)
            map.put("state","加入课堂");
        else {
            map.put("state","回到课堂");
            map.put("class_id",equipment.getClass_id());
            map.put("equipment_id",equipment.getEquipment_id());
            map.put("equipment_number",equipment.getNumber());
        }
        return map;
    }

    @Override
    public Map<String, String> studentAddClass(String studentId, String classCode) {
        Map<String, String> map = new HashMap<>();
        Laboratory laboratory = laboratoryDao.selectLaboratoryClassCode(classCode);
        if (laboratory == null){
            map.put("state","该房间不存在!");
            return map;
        }
        String class_id = laboratory.getClass_id();
        List<Equipment> list = equipmentDao.selectEquipmentByClassId(class_id);
        for (int i=0;i<list.size();i++){
            int state = list.get(i).getState();
            if (state == 1){//硬件线路无误
                String student_id = list.get(i).getStudent_id();
                if (student_id == null || "".equals(student_id)){//没有绑定
                    int key = equipmentDao.updateStudentByEuqipmentId(list.get(i).getEquipment_id(),studentId);
                    if (key > 0){
                        map.put("state","加入成功");
                        map.put("class_id",list.get(i).getClass_id());
                        map.put("equipment_id",list.get(i).getEquipment_id());
                        map.put("equipment_number",list.get(i).getNumber());
                        return map;
                    }
                }
            }
        }

        map.put("state","房间人数已满");
        return map;
    }


    @Override
    public void studentLost(String equipmentKey) {
        equipmentDao.updateState(0,equipmentKey);
        equipmentDao.updateStudentByEuqipmentId(equipmentKey,null);
        equipmentDao.updateStartTimeByEquipmentId(0,equipmentKey);
        equipmentDao.updateEquStateByEquipmentId(1,equipmentKey);
        equipmentDao.updateRotateFutureByEquipmentId(0.0,equipmentKey);
        equipmentDao.updateExterFutureByEquipmentId(0.0,equipmentKey);
        equipmentDao.updateCoreFutureByEquipmentId(0.0,equipmentKey);
    }


    @Override
    public boolean overExper(String equipmentKey) {
        try {
            ClientDevice clientDevice = ApplicationTools.clientsMap.get(equipmentKey);
            if (clientDevice != null)
                clientDevice.send("close");
            studentLost(equipmentKey);
            return true;
        }catch (Exception e){
            studentLost(equipmentKey);
            return false;
        }
    }

    @Override
    public boolean startExper(final String equipmentKey) {
        try {
            ClientDevice clientDevice = ApplicationTools.clientsMap.get(equipmentKey);
            if (clientDevice != null){
                equipmentDao.updateState(1,equipmentKey);
                clientDevice.send("start");
            }

            long start = equipmentDao.selectStartTimeByEquipmentId(equipmentKey);
            if (start == 0){
                start = System.currentTimeMillis();
                equipmentDao.updateStartTimeByEquipmentId(start,equipmentKey);
            }
            final long startTime = start;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    while (true){
                        synchronized (StudentServerImpl.class){
                            if(ApplicationTools.clientsMap.get(equipmentKey)==null) {
                                break;
                            }
                            try {
                                String jsonData = clientDevice.receive();
                                if ("".equals(jsonData)) {
                                    continue;
                                }
                                EquData equ = null;
                                try {
                                    equ = JSONObject.parseObject(jsonData,EquData.class);
                                }catch (Exception e){
                                    continue;
                                }
                                /*********************更改状态********************/
                                equipmentDao.updateEquStateByEquipmentId(equ.getState(),equipmentKey);
                                equipmentDao.updateRotateFutureByEquipmentId(equ.getRotate_future(),equipmentKey);
                                equipmentDao.updateExterFutureByEquipmentId(equ.getExter_future(),equipmentKey);
                                equipmentDao.updateCoreFutureByEquipmentId(equ.getCore_future(),equipmentKey);
                                /*********************存储数据********************/
                                EquipmentData equipment = new EquipmentData();
                                equipment.setRotate(equ.getRotate());
                                equipment.setCore_temper(equ.getCore_temper());
                                equipment.setExter_temper(equ.getExter_temper());
                                equipment.setTime(System.currentTimeMillis());
                                equipment.setEquipment_id(equipmentKey);
                                equipment.setStart_time(startTime);
                                equDataDao.insertEquipmentData(equipment);

                            }catch (Exception e){
                                equipmentDao.updateState(0,equipmentKey);
                                break;
                            }
                        }
                    }
                }
            }).start();
            return true;
        }catch (Exception e){
            equipmentDao.updateState(0,equipmentKey);
            return false;
        }
    }

    @Override
    public boolean rotateExper(String equipmentKey, String strInstruct) {
        try {
            ClientDevice clientDevice = ApplicationTools.clientsMap.get(equipmentKey);
            if (clientDevice != null)
                equipmentDao.updateState(1,equipmentKey);

            clientDevice.send(strInstruct);
            return true;
        }catch (Exception e){
            equipmentDao.updateState(0,equipmentKey);
            return false;
        }
    }

    @Override
    public List<EquipmentData> getData(long startTime, String equipmentKey, String studentId) {
        ClientDevice clientDevice = ApplicationTools.clientsMap.get(equipmentKey);
        if (clientDevice == null){
            equipmentDao.updateState(0,equipmentKey);
            return null;
        }else
            equipmentDao.updateState(1,equipmentKey);
        long start = equipmentDao.selectStartTimeByEquipmentId(equipmentKey);
        List<EquipmentData> list = equDataDao.selectEquipmentData(equipmentKey,start);
        return list;
    }

    @Override
    public EquipmentState getEquipmentState(String equipmentId) {
        EquipmentState equipmentState = new EquipmentState();
        equipmentState.setCore_future(equipmentDao.selectCoreFutureByEquipmentId(equipmentId));
        equipmentState.setExter_future(equipmentDao.selectExterFutureByEquipmentId(equipmentId));
        equipmentState.setRotate_future(equipmentDao.selectRotateFutureByEquipmentId(equipmentId));
        equipmentState.setEqu_state(equipmentDao.selectEquStateByEquipmentId(equipmentId));
        return equipmentState;
    }

}
