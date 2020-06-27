package lab.jlhgxy520.equipment;

import lab.jlhgxy520.equipment.socket.DeviceServerSocket;
import lab.jlhgxy520.equipment.tools.GrpcService;
import lab.jlhgxy520.equipment.tools.RpcServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Map;

@SpringBootApplication
public class EquipmentApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EquipmentApplication.class, args);
        new Thread(new Runnable() {
            @Override
            public void run() {
                Map<String, Object> grpcServiceBeanMap =  context.getBeansWithAnnotation(GrpcService.class);
                RpcServer grpcServer = context.getBean("GrpcServer", RpcServer.class);
                grpcServer.grpcStart(grpcServiceBeanMap);
            }
        }).start();
        context.getBean(DeviceServerSocket.class).start();

    }

}
