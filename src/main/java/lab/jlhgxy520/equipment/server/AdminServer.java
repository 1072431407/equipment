package lab.jlhgxy520.equipment.server;

import lab.jlhgxy520.equipment.po.AdminTeacher;
import lab.jlhgxy520.equipment.po.Equipment;
import lab.jlhgxy520.equipment.po.Laboratory;

import java.util.List;

public interface AdminServer {
    List<AdminTeacher> getTeacherList();

    List<Laboratory> getLaboratoryList(String teacherId);

    Laboratory addLaboratory(String classNumber, String teacherId);

    Equipment addEquipment(String classId, long time, String equipmentNumber);

    List<Equipment> getEquipmentList(String classId);

    boolean removeTeacher(String teacherId);

    boolean removeLaboratory(String classId);

    boolean removeEquipment(String equipmentId);
}
