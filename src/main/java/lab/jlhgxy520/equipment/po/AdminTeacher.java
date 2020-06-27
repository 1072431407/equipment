package lab.jlhgxy520.equipment.po;

public class AdminTeacher {
    private String teacher_id;
    private String class_number;
    private String name;
    private String school;
    private String number;//工号


    public void setTeacher_id(String teacher_id) {
        this.teacher_id = teacher_id;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTeacher_id() {
        return teacher_id;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public String getNumber() {
        return number;
    }

    public void setClass_number(String class_number) {
        this.class_number = class_number;
    }

    public String getClass_number() {
        return class_number;
    }

}
