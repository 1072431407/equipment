package lab.jlhgxy520.equipment.client;

import com.alibaba.fastjson.JSONObject;
import lab.jlhgxy520.equipment.tools.ApplicationTools;

import java.io.*;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * 实验设备端
 */
public class DeviceClient {
    private static boolean isBound = false;
    private Socket socket;
    private DataOutputStream outputStream;
    private DataInputStream inputStream;
    private int interval = 5;//时间间隔
    private double rotate_future = 0;//转速 255210
    private double exter_future = 0;//外温
    private double core_future = 0;//内温
    private int state = 1;//状态0标识启动  1标识停止
    public DeviceClient() throws IOException{
        String host = ApplicationTools.SERVER_IP;
        int port = ApplicationTools.SOCKET_PORT;;
        // 与服务端建立连接
        socket = new Socket(host, port);
        socket.setOOBInline(true);
        // 建立连接后获得输出流
        outputStream = new DataOutputStream( socket.getOutputStream());
        /**
         * 创建时间  修改时间 创建人 修改人
         */
        /**
         * 写入设备基本信息
         * 学校、教师、教室信息、年级、实验设备数目。
         */
        DeviceEquipment equipment = new DeviceEquipment();
        equipment.setSchool("吉林化工学院");
        equipment.setClass_number("520");
        equipment.setNumber("0001");

        String json= JSONObject.toJSONString(equipment);

        System.out.println("equipment_data:"+json);
        outputStream.write(json.getBytes());
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    try {
//                        if (!isBound)
//                            continue;
//                        TimeUnit.SECONDS.sleep(10);
//                        EquData equData = new EquData();
//                        equData.setRotate(-1);
//                        equData.setCore_future(core);
//                        equData.setExter_future(exter);
//                        equData.setRotate_future(rotate);
//                        equData.setState(state);
//
//                        String json= JSONObject.toJSONString(equData);
//                        outputStream.write(json.getBytes());
//                    } catch (Exception e) {
//                        close();
//                        System.exit(0);
//                    }
//                }
//            }
//        }).start();


        /**
         * 将设备当前状态写入流中
        */
         new Thread(new Runnable() {
            @Override
            public void run() {
                //实时数据
                double rotate = 0;
                double core = 0;
                double exter = 0;
                while (true){
                    if (!isBound)
                        continue;
                    try {
                        rotate += 0.4;
                        core += 0.2;
                        exter += 0.1;
                        exter += core;
                        EquData equData = new EquData();
                        equData.setRotate(rotate);
                        equData.setCore_temper(core);
                        equData.setExter_temper(exter);
                        equData.setCore_future(core_future);
                        equData.setExter_future(exter_future);
                        equData.setRotate_future(rotate_future);
                        equData.setState(state);

                        String json= JSONObject.toJSONString(equData);
                        System.out.println(json);
                        outputStream.write(json.getBytes());
                        TimeUnit.SECONDS.sleep(interval);
                    } catch (Exception e) {
                        close();
                        System.exit(0);
                    }
                }
            }
        }).start();
//        接收指令
        inputStream = new DataInputStream(socket.getInputStream());;
        while (true){
            byte[] bytes = new byte[1024];
            try {
                inputStream.read(bytes);
                String info = new String(bytes, "utf-8");
                info = info.trim();
                if ("".equals(info))
                    continue;
                System.out.println("info:"+info);
                if ("start".equals(info)){
                    isBound = true;
                    interval = 10;
                    continue;
                }
                if ("over".equals(info)){
                    isBound = false;
                    continue;
                }
                if ("close".equals(info)){
                    close();
                    continue;
                }



                if (info.length()>9)//{interval:35}时间间隔
                    if ("interval:".equals(info.substring(0,9))){
                        setInterval(info.substring(9));
                        continue;
                    }
                if (info.length()>12)//{core_future:35.16}内温
                    if ("core_future:".equals(info.substring(0,12))){
                        setCore_future(info.substring(12));
                        continue;
                    }
                if (info.length()>13)//{exter_future:35.16}外温
                    if ("exter_future:".equals(info.substring(0,13))){
                        setExter_future(info.substring(13));
                        continue;
                    }
                if (info.length()>14)//{rotate_future:35.16}转速
                    if ("rotate_future:".equals(info.substring(0,14))){
                        setRotate_future(info.substring(14));
                    }
            } catch (IOException e) {
                close();
                System.exit(0);
            }
        }


    }

    private void setRotate_future(String substring) {
        System.out.println(substring);
        try {
            double rotate = Double.parseDouble(substring);
            this.rotate_future = rotate;
        }catch (Exception e){
        }
    }
    private void setExter_future(String substring) {
        System.out.println(substring);
        try {
            double rotate = Double.parseDouble(substring);
            this.exter_future = rotate;
        }catch (Exception e){
        }
    }
    private void setCore_future(String substring) {
        System.out.println(substring);
        try {
            double rotate = Double.parseDouble(substring);
            this.core_future = rotate;
        }catch (Exception e){
        }
    }
    private void setInterval(String substring) {
        System.out.println(substring);
        try {
            int rotate = Integer.parseInt(substring);
            interval = rotate;
        }catch (Exception e){
            interval = 10;
        }
    }


    public static void main(String[] args) throws IOException {
       new DeviceClient();
    }
    /**
     * 返回数据
     */

    private void close(){
        System.out.println("设备链接已断开...");
        try {
            if (inputStream!=null)
                inputStream.close();
            if (outputStream!=null)
                outputStream.close();
            if (socket!=null)
                socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
