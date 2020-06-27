package lab.jlhgxy520.equipment.socket;

import com.alibaba.fastjson.JSONObject;
import lab.jlhgxy520.equipment.client.DeviceEquipment;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import lab.jlhgxy520.equipment.tools.LimitQueue;
import org.springframework.stereotype.Component;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/**
 * 每个ClientDevice对象代表一台实验设备
 */

public class ClientDevice implements Runnable {
    private final int heartbeat = 5;
    private Socket socket;
    private DataInputStream inputStream;
    private DataOutputStream outputStream;
    private String key;//UUID
    private String clientIP;
    private String number;
    private String school;
    private String class_number;
//
//    private LimitQueue<String> limitQueue;//List<EquipmentData> 的Json对象
//    private StringBuffer realtimeData;//EquipmentData 的Json对象


    /**
     * 注册socket到map里
     * @param socket
     * @return
     */
    public static ClientDevice register(Socket socket) {

        ClientDevice client = new ClientDevice();
        try {
            client.setSocket(socket);
            client.setInputStream(new DataInputStream(socket.getInputStream()));
            client.setOutputStream(new DataOutputStream(socket.getOutputStream()));
            String message = client.receive();
            client.setEquipmentData(message);
            String key = ApplicationTools.getUUID();
            client.setKey(key);
            client.setClientIP(socket.getInetAddress().toString());
            ApplicationTools.logger.info("Device Add:"+client.getSchool()+"-"+client.getClass_number()+"-"+client.getNumber());
            ApplicationTools.clientsMap.put(key, client);
            return client;
        } catch (IOException e) {
            client.logout();
        }
        return null;
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



    private void setClientIP(String clientIP) {
        clientIP = clientIP.substring(1);
        this.clientIP = clientIP;
    }

    public String getClientIP() {
        return clientIP;
    }

    private void setEquipmentData(String equipment_id) {
        DeviceEquipment equipment = JSONObject.parseObject(equipment_id, DeviceEquipment.class);
        this.school = equipment.getSchool();
        this.class_number = equipment.getClass_number();
        this.number = equipment.getNumber();
    }

    private String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    private InputStream getInputStream() {
        return inputStream;
    }

    private void setOutputStream(DataOutputStream dataOutputStream) {
        this.outputStream = dataOutputStream;
    }

    private void setInputStream(DataInputStream dataInputStream) {
        this.inputStream = dataInputStream;
    }

    private void setSocket(Socket socket) {
        this.socket = socket;
    }


    /**
     * 发送数据
     *
     * @param str
     */
    public void send(String str) {
        try {
            outputStream.write(str.getBytes());
            //将str转换可读取语言添加到指令队列中
        } catch (IOException e) {
            logout();
        }
    }

    /**
     * 接收数据
     * @return
     * @throws IOException
     */
    public String receive() {
        try {
            byte[] bytes = new byte[2048];
            inputStream.read(bytes);
            String info = new String(bytes, "utf-8");
            info = info.trim();

            return info;
        } catch (IOException e) {
            logout();
        }
        return null;
    }

    /**
     * 登出操作, 关闭各种流
     */
    public void logout() {
        if (ApplicationTools.clientsMap.get(key)!=null) {
            ApplicationTools.clientsMap.remove(key);
        }
        ApplicationTools.logger.info("Device Remove:"+getSchool()+"-"+getClass_number()+"-"+getNumber());
        try {
            socket.shutdownOutput();
            socket.shutdownInput();
        } catch (IOException e) {
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
            }
        }
    }

    /**
     * 发送数据包, 判断数据连接状态
     * @return
     */
    public boolean isSocketClosed() {
        try {
            socket.sendUrgentData(1);
            return false;
        } catch (IOException e) {
            return true;
        }
    }

    @Override
    public void run() {
        // 每过5秒连接一次客户端
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(heartbeat);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (isSocketClosed()) {
                logout();
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "socket=" + socket +
                ", inputStream=" + inputStream +
                ", outputStream=" + outputStream +
                ", key='" + key + '\'' +
                '}';
    }


}
