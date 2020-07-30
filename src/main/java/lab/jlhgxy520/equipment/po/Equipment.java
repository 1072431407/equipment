package lab.jlhgxy520.equipment.po;

/**
 * equipment_id,class_id,time,number,state,school,class_number
 */
public class Equipment {
    private String equipment_id;//设备ID
    private String class_id;
    private long time;
    private String number;
    private String school;
    private String class_number;
    private int state;

    private String student_name;
    private String student_id;
    private double core_future;
    private double rotate_future;//转速 255210
    private double exter_future;//外温

    public void setRotate_future(double rotate_future) {
        this.rotate_future = rotate_future;
    }

    public void setExter_future(double exter_future) {
        this.exter_future = exter_future;
    }

    public void setCore_future(double core_future) {
        this.core_future = core_future;
    }

    public double getRotate_future() {
        return rotate_future;
    }

    public double getExter_future() {
        return exter_future;
    }

    public double getCore_future() {
        return core_future;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setClass_id(String class_id) {
        this.class_id = class_id;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEquipment_id(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public void setClass_number(String class_number) {
        this.class_number = class_number;
    }

    public String getClass_id() {
        return class_id;
    }

    public long getTime() {
        return time;
    }

    public String getNumber() {
        return number;
    }

    public String getEquipment_id() {
        return equipment_id;
    }

    public int getState() {
        return state;
    }

    public String getClass_number() {
        return class_number;
    }

    public String getSchool() {
        return school;
    }
}

