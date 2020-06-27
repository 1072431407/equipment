package lab.jlhgxy520.equipment.po;

public class User {
    private String id;
    private String username;
    private String password;
    private int power;
    private String school;
    private String field1;
    private String field2;

    public void setId(String id) {
        this.id = id;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getField1() {
        return field1;
    }

    public String getField2() {
        return field2;
    }

    public String getSchool() {
        return school;
    }

    public String getId() {
        return id;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

}
