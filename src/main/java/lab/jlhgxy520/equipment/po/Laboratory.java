package lab.jlhgxy520.equipment.po;

/**
 * class_id,class_number,teacher_id,school,state
 */
public class Laboratory {
    private String class_id;//课堂id//UUID
    private String class_number;//520
    private String class_code;//602346
    private int equipment_number;//实验室设备数量
    private String teacher_id;

    private String school;
    private int state;//课堂状态 0代表没上课1代表正在上课

    public void setClass_number(String class_number) {
        this.class_number = class_number;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public void setClass_code(String class_code) {
        this.class_code = class_code;
    }

    public void setEquipment_number(int equipment_number) {
        this.equipment_number = equipment_number;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getSchool() {
        return school;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public String getClass_number() {
        return class_number;
    }

    public String getClass_id() {
        return class_id;
    }

    public int getEquipment_number() {
        return equipment_number;
    }

    public String getClass_code() {
        return class_code;
    }

    public int getState() {
        return state;
    }
}
