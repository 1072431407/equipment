package lab.jlhgxy520.equipment.server.impl;

import lab.jlhgxy520.equipment.dao.EquipmentDao;
import lab.jlhgxy520.equipment.dao.LaboratoryDao;
import lab.jlhgxy520.equipment.dao.UserDao;
import lab.jlhgxy520.equipment.po.*;
import lab.jlhgxy520.equipment.server.TeacherServer;
import lab.jlhgxy520.equipment.socket.ClientDevice;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class TeacherServerImpl implements TeacherServer {

    @Autowired
    private LaboratoryDao laboratoryDao;
    @Autowired
    private EquipmentDao equipmentDao;
    @Autowired
    private UserDao userDao;
    @Override
    public List<Laboratory> getLaboratoryList(String teacherId) {
        try{
            List<Laboratory> list = laboratoryDao.selectLaboratoryByTeacherId(teacherId);
            for (Laboratory item:list)
                item.setEquipment_number(equipmentDao.selectEquipmentByClassId(item.getClass_id()).size());
            return list;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<Equipment> getEquipmentList(String classId) {
        try{
            ConcurrentHashMap<String, ClientDevice> clientsMap = ApplicationTools.getClientsMap(equipmentDao.selectEquipmentByClassId(classId));
            for (Map.Entry<String, ClientDevice> item:clientsMap.entrySet())
                equipmentDao.updateState(1,item.getKey());

            List<Equipment> list = equipmentDao.selectEquipmentByClassId(classId);
            for (Equipment item:list){
                if (item.getState() == 1){
                    if (ApplicationTools.clientsMap.get(item.getEquipment_id())==null){
                        equipmentDao.updateState(0,item.getEquipment_id());
                        item.setState(0);
                    }
                }
                String student_id = equipmentDao.selectStudentIdByEquipmentId(item.getEquipment_id());
                if (student_id == null || "".equals(student_id)){
                    item.setStudent_id("");
                    item.setStudent_name("");
                }else {
                    item.setStudent_id(student_id);
                    item.setStudent_name(userDao.selectField1(student_id));
                }
                item.setExter_future(equipmentDao.selectExterFutureByEquipmentId(item.getEquipment_id()));
                item.setCore_future(equipmentDao.selectCoreFutureByEquipmentId(item.getEquipment_id()));
                item.setRotate_future(equipmentDao.selectRotateFutureByEquipmentId(item.getEquipment_id()));
            }
            return list;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public String attendClass(String classId) {
        String class_code = getClassCode();
        while (true){
            Laboratory laboratory = laboratoryDao.selectLaboratoryClassCode(class_code);
            if (laboratory == null)
                break;
            class_code = getClassCode();
        }
        int key = laboratoryDao.updateClassState(classId,1,class_code);
        List<Equipment> list = equipmentDao.selectEquipmentByClassId(classId);
        ConcurrentHashMap<String, ClientDevice> clientsMap = ApplicationTools.getClientsMap(list);
        for (Map.Entry<String, ClientDevice> item:clientsMap.entrySet()){
            equipmentDao.updateState(1,item.getKey());
        }
        if (key>0)
            return class_code;
        return null;
    }

    @Override
    public boolean finishClass(String classId) {
        try {
            laboratoryDao.updateClassState(classId,0,null);
            equipmentDao.resetState(classId,0,null);
            List<Equipment> list = equipmentDao.selectEquipmentByClassId(classId);
            for (Equipment item:list){
                equipmentDao.updateStartTimeByEquipmentId(0,item.getEquipment_id());
                ClientDevice clientDevice = ApplicationTools.clientsMap.get(item.getEquipment_id());
                if (clientDevice != null)
                    clientDevice.logout();
            }
            return true;
        }catch (Exception e) {
            return false;
        }
    }

    private String getClassCode() {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
}
