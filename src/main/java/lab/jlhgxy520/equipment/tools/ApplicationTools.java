package lab.jlhgxy520.equipment.tools;

import com.alibaba.fastjson.JSONObject;
import lab.jlhgxy520.equipment.EquipmentApplication;
import lab.jlhgxy520.equipment.po.EquipmentData;
import lab.jlhgxy520.equipment.po.Equipment;
import lab.jlhgxy520.equipment.po.LabStatistics;
import lab.jlhgxy520.equipment.socket.ClientDevice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.lang.NonNull;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/**
 * https://github.com/1072431407/graduation_server.git
 * git remote add origin {url}
 * git pull origin master
 */
public class ApplicationTools {
    public final static String SERVER_IP =  "192.168.102.56";
    public final static int MAX_SOCKET = 10;
    public final static Integer GRPC_PORT =  8282;
    public final static Integer SOCKET_PORT =  8899;

    public static Logger logger = LoggerFactory.getLogger(EquipmentApplication.class);
    //用于存储在线机器对象
    public static ConcurrentHashMap<String, ClientDevice> clientsMap = new ConcurrentHashMap<>();
    public static String getUUID(){
        String uuid = UUID.randomUUID().toString();  //转化为String对象
        return uuid.replace("-", "");
    }

    /**
     * 返回教室ip对应的机器
     * @param list
     * @return
     */
    public static ConcurrentHashMap<String, ClientDevice> getClientsMap(@NonNull List<Equipment> list){
        ConcurrentHashMap<String, ClientDevice> clients = new ConcurrentHashMap<>();
        if (clientsMap.size()==0)
            return clients;
        List<String> removeList = new ArrayList<>();
        for (Equipment l:list){
            String school = l.getSchool();
            String number = l.getNumber();
            String class_number = l.getClass_number();
            String equipment_id = l.getEquipment_id();
            for (Map.Entry<String, ClientDevice> item : clientsMap.entrySet()) {
                if(equipment_id.equals(item.getKey()))
                    break;
                ClientDevice client = item.getValue();
                if (school.equals(client.getSchool()) &&
                        number.equals(client.getNumber()) &&
                        class_number.equals(client.getClass_number())){
                    client.setKey(equipment_id);
                    clients.put(equipment_id,client);
                    removeList.add(item.getKey());
                    break;
                }
            }
        }
        for (Map.Entry<String, ClientDevice> item : clients.entrySet())
            clientsMap.put(item.getKey(),item.getValue());

        for(String key:removeList)
            clientsMap.remove(key);


        return clients;
    }

}
