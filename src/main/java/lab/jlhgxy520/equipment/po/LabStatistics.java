package lab.jlhgxy520.equipment.po;

public class LabStatistics {
    private String class_number;//实验室编号【520】
    private int equipment_number;//已连接设备数量
    private int student_number;//在线学生数量

    public void setStudent_number(int student_number) {
        this.student_number = student_number;
    }

    public int getEquipment_number() {
        return equipment_number;
    }

    public void setClass_number(String class_number) {
        this.class_number = class_number;
    }

    public int getStudent_number() {
        return student_number;
    }

    public void setEquipment_number(int equipment_number) {
        this.equipment_number = equipment_number;
    }

    public String getClass_number() {
        return class_number;
    }
}
