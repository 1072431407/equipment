package lab.jlhgxy520.equipment.client;

public class DeviceEquipment {
    private String number;
    private String school;
    private String class_number;

    public void setClass_number(String class_number) {
        this.class_number = class_number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public String getClass_number() {
        return class_number;
    }

    public String getNumber() {
        return number;
    }
}
