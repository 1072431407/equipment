package lab.jlhgxy520.equipment.po;

public class TeacherListBean {
    private String equipment_key;//设备UUID
    private String equipment_id;//设备编号
    private boolean isBound;//是否有学生绑定
    private String student_id;//学生UUID
    private String student_name;//学生姓名
    private String student_number;//学生学号

    public void setBound(boolean isBound) {
        this.isBound = isBound;
    }

    public boolean getBound() {
        return isBound;
    }

    public void setEquipment_key(String equipment_key) {
        this.equipment_key = equipment_key;
    }

    public String getEquipment_key() {
        return equipment_key;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setEquipment_id(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public String getEquipment_id() {
        return equipment_id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public String getStudent_number() {
        return student_number;
    }
}
