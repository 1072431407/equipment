package lab.jlhgxy520.equipment.po;

public class ClassRoom {
    private String class_id;
    private String school;
    private String class_number;
    private String class_ip;
    private String equipment_key;
    private String student_id;
    private String teacher_id;

    public void setSchool(String school) {
        this.school = school;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public void setClass_ip(String class_ip) {
        this.class_ip = class_ip;
    }

    public void setClass_number(String class_number) {
        this.class_number = class_number;
    }

    public void setEquipment_key(String equipment_key) {
        this.equipment_key = equipment_key;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getSchool() {
        return school;
    }

    public String getClass_id() {
        return class_id;
    }

    public String getClass_ip() {
        return class_ip;
    }

    public String getClass_number() {
        return class_number;
    }

    public String getEquipment_key() {
        return equipment_key;
    }

    public String getStudent_id() {
        return student_id;
    }

    public String getTeacher_id() {
        return teacher_id;
    }
}
