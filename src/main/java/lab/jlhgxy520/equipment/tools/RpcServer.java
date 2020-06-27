package lab.jlhgxy520.equipment.tools;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import lab.jlhgxy520.equipment.socket.DeviceServerSocket;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import org.slf4j.Logger;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Map;

@Component("GrpcServer")
public class RpcServer {
    private Logger logger = ApplicationTools.logger;
    /**
     * 定义Grpc Server
     */
    private Server server;

    private Integer PORT = ApplicationTools.GRPC_PORT;
    /**
     * GRPC 服务启动方法
     * @param grpcServiceBeanMap
     */
    public void grpcStart(Map<String, Object> grpcServiceBeanMap) {
        try{
            ServerBuilder serverBuilder = ServerBuilder.forPort(PORT);
            for (Object bean : grpcServiceBeanMap.values()){
                serverBuilder.addService((BindableService) bean);
                logger.info(bean.getClass().getSimpleName() + " is regist in Spring Boot");
            }
            server = serverBuilder.build().start();
            logger.info("grpc server is started at " +  PORT);
            server.awaitTermination();
            Runtime.getRuntime().addShutdownHook(new Thread(()->{grpcStop();}));
        } catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * GRPC 服务Stop方法
     */
    private void grpcStop(){
        if (server != null){
            server.shutdownNow();
        }
    }
}
