package lab.jlhgxy520.equipment.server.impl;

import lab.jlhgxy520.equipment.dao.EquipmentDao;
import lab.jlhgxy520.equipment.dao.LaboratoryDao;
import lab.jlhgxy520.equipment.dao.UserDao;
import lab.jlhgxy520.equipment.po.AdminTeacher;
import lab.jlhgxy520.equipment.po.Equipment;
import lab.jlhgxy520.equipment.po.Laboratory;
import lab.jlhgxy520.equipment.po.User;
import lab.jlhgxy520.equipment.server.AdminServer;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminServerImpl implements AdminServer {
    @Autowired
    private UserDao userDao;

    @Autowired
    private LaboratoryDao laboratoryDao;

    @Autowired
    private EquipmentDao equipmentDao;
    @Override
    public List<AdminTeacher> getTeacherList() {
        try{
            List<User> list = userDao.selectUserByPower(2);
            List<AdminTeacher> listBeans = new ArrayList<>();
            if (list != null){
                for (int i=0;i<list.size();i++){
                    AdminTeacher bean = new AdminTeacher();
                    List<Laboratory> laboratories = laboratoryDao.selectLaboratoryByTeacherId(list.get(i).getId());
                    bean.setTeacher_id(list.get(i).getId());
                    bean.setSchool(list.get(i).getSchool());
                    bean.setName(list.get(i).getField1());
                    bean.setNumber(list.get(i).getField2());
                    bean.setClass_number(laboratories.size()+"");
                    listBeans.add(bean);
                }
            }
            return listBeans;
        }catch (Exception e){
            return null;
        }
    }

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
    public Laboratory addLaboratory(String classNumber, String teacherId) {
        try{
            Laboratory laboratory = new Laboratory();
            laboratory.setClass_id(ApplicationTools.getUUID());
            laboratory.setClass_number(classNumber);
            laboratory.setEquipment_number(0);
            laboratory.setTeacher_id(teacherId);
            laboratory.setSchool(userDao.selectSchool(teacherId));
            laboratory.setState(0);
            int key = laboratoryDao.insertLaboratory(laboratory);
            if (key>0)
                return laboratory;
            else
                return null;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public Equipment addEquipment(String classId, long time, String equipmentNumber) {
        try{
            Equipment equipment = new Equipment();
            equipment.setEquipment_id(ApplicationTools.getUUID());
            equipment.setClass_id(classId);
            equipment.setTime(time);
            equipment.setNumber(equipmentNumber);
            equipment.setState(0);
            equipment.setSchool(laboratoryDao.selectSchoolByClassId(classId));
            equipment.setClass_number(laboratoryDao.selectClassNumberByClassId(classId));
            int key = equipmentDao.insertEquipment(equipment);
            if (key>0)
                return equipment;
            else
                return null;
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public List<Equipment> getEquipmentList(String classId) {
        try{
            return equipmentDao.selectEquipmentByClassId(classId);
        }catch (Exception e){
            return null;
        }
    }

    @Override
    public boolean removeTeacher(String teacherId) {
        try{
            List<Laboratory> list = laboratoryDao.selectLaboratoryByTeacherId(teacherId);
            if (list.size()>0)
                for (Laboratory item:list){
                    equipmentDao.removeEquipmentByClassId(item.getClass_id());
                    laboratoryDao.removeClassByClassId(item.getClass_id());
                }
            userDao.removeTeacherById(teacherId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean removeLaboratory(String classId) {
        try{
            equipmentDao.removeEquipmentByClassId(classId);
            laboratoryDao.removeClassByClassId(classId);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public boolean removeEquipment(String equipmentId) {
        try{
            equipmentDao.removeEquipmentByEquipmentId(equipmentId);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
