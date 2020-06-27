package lab.jlhgxy520.equipment.po;

public class EquipmentState {
    private int equ_state;//0标识启动  1标识停止
    private double rotate_future;//将要达到的转速
    private double exter_future;//将要达到的外温
    private double core_future;//将要达到的内温

    public void setCore_future(double core_future) {
        this.core_future = core_future;
    }

    public void setEqu_state(int equ_state) {
        this.equ_state = equ_state;
    }

    public void setExter_future(double exter_future) {
        this.exter_future = exter_future;
    }

    public void setRotate_future(double rotate_future) {
        this.rotate_future = rotate_future;
    }

    public double getCore_future() {
        return core_future;
    }

    public double getExter_future() {
        return exter_future;
    }

    public double getRotate_future() {
        return rotate_future;
    }

    public int getEqu_state() {
        return equ_state;
    }
}
