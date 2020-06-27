package lab.jlhgxy520.equipment.socket;

import lab.jlhgxy520.equipment.tools.ApplicationTools;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component("ServerSocket")
public class DeviceServerSocket {
    private Integer port = ApplicationTools.SOCKET_PORT;
    private boolean started;
    private ServerSocket serverSocket;

    private ExecutorService executorService = Executors.newFixedThreadPool(ApplicationTools.MAX_SOCKET);
//    private ExecutorService executorService = Executors.newCachedThreadPool();
    public void start() {
        start(null);
    }

    public void start(Integer port) {
        try {
            serverSocket = new ServerSocket(port == null ? this.port : port);
            started = true;
            ApplicationTools.logger.info("Device Server Socket start,port:"+serverSocket.getLocalPort()+",max thread:"+ApplicationTools.MAX_SOCKET);
        } catch (Exception e) {
            ApplicationTools.logger.info("端口使用中....");
            ApplicationTools.logger.info("请关掉相关程序并重新运行服务器！");
            e.printStackTrace();
            System.exit(0);
        }

        try {
            while (started) {
                Socket socket = serverSocket.accept();
                socket.setKeepAlive(true);
                ClientDevice register = ClientDevice.register(socket);
                if (register != null) {
                    executorService.submit(register);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
