package lab.jlhgxy520.equipment.server;

import lab.jlhgxy520.equipment.po.ClassRoom;
import lab.jlhgxy520.equipment.po.Equipment;
import lab.jlhgxy520.equipment.po.Laboratory;

import java.util.List;
import java.util.Map;

public interface TeacherServer {

    List<Laboratory> getLaboratoryList(String teacherId);

    List<Equipment> getEquipmentList(String classId);

    String attendClass(String classId);

    boolean finishClass(String classId);

}
