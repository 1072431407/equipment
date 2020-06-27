package lab.jlhgxy520.equipment.server;

import lab.jlhgxy520.equipment.po.EquipmentData;
import lab.jlhgxy520.equipment.po.EquipmentState;

import java.util.List;
import java.util.Map;

public interface StudentServer {
    Map<String, String> getClassState(String studentId);

    Map<String, String> studentAddClass(String studentId, String classId);

    void studentLost(String equipmentKey);

    boolean overExper(String equipmentKey);

    boolean startExper(String equipmentKey);

    boolean rotateExper(String equipmentKey, String rotate);

    List<EquipmentData> getData(long startTime, String equipmentKey, String studentId);

    EquipmentState getEquipmentState(String equipmentId);
}
