package lab.jlhgxy520.equipment.po;

/**
 * 设备的状态参数 time,rotate,core_temper,exter_temper,equipment_id,start_time
 */
public class EquipmentData {
    private double core_temper;//内温度
    private double exter_temper;//外温度
    private double rotate;//转速
    private int state;//状态 0标识启动  1标识停止
    private double core_future;//指令内温
    private double exter_future;//指令外温
    private double rotate_future;//指令转速

    private long time;//系统时间
    private String equipment_id;
    private long start_time;
    private int interval;//时间间隔 s


    public double getCore_future() {
        return core_future;
    }

    public double getExter_future() {
        return exter_future;
    }

    public double getRotate_future() {
        return rotate_future;
    }

    public void setCore_future(double core_future) {
        this.core_future = core_future;
    }

    public void setExter_future(double exter_future) {
        this.exter_future = exter_future;
    }

    public void setRotate_future(double rotate_future) {
        this.rotate_future = rotate_future;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getState() {
        return state;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public int getInterval() {
        return interval;
    }

    public void setStart_time(long start_time) {
        this.start_time = start_time;
    }

    public long getStart_time() {
        return start_time;
    }
    public void setEquipment_id(String equipment_id) {
        this.equipment_id = equipment_id;
    }

    public String getEquipment_id() {
        return equipment_id;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }


    public void setCore_temper(double core_temper) {
        this.core_temper = core_temper;
    }

    public void setExter_temper(double exter_temper) {
        this.exter_temper = exter_temper;
    }

    public double getCore_temper() {
        return core_temper;
    }

    public double getExter_temper() {
        return exter_temper;
    }

    public void setRotate(double rotate) {
        this.rotate = rotate;
    }

    public double getRotate() {
        return rotate;
    }


}
