package lab.jlhgxy520.equipment.rpc.server;

import io.grpc.stub.StreamObserver;
import lab.jlhgxy520.equipment.conversion.StudentConversion;
import lab.jlhgxy520.equipment.rpc.proto.admin.getEquipmentResponse;
import lab.jlhgxy520.equipment.rpc.proto.student.*;
import lab.jlhgxy520.equipment.socket.ClientDevice;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import lab.jlhgxy520.equipment.tools.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GrpcService
public class StudentGrpcServer extends StudentRpcServerGrpc.StudentRpcServerImplBase {

    @Autowired
    private StudentConversion studentConversion;

    @Override
    public void getEquipmentState(EquipmentStateRequest request, StreamObserver<EquipmentStateResponse> responseObserver) {
        responseObserver.onNext(studentConversion.getEquipmentState(request));
        responseObserver.onCompleted();
    }

    @Override
    public void realTimeData(realTimeRequest request, StreamObserver<realTimeResponse> responseObserver) {
        List<realTimeResponse> listBeans = studentConversion.realTimeData(request);
        if (listBeans == null) {
            try {
                responseObserver.onError(new Throwable("主动异常"));
            } catch (Exception e) {
            }
            responseObserver.onCompleted();
            return;
        }
        for (realTimeResponse item : listBeans)
            responseObserver.onNext(item);
        responseObserver.onCompleted();

    }

    /**
     * 获取课堂状态
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void studentClassState(studentStateRequest request, StreamObserver<studentStateResponse> responseObserver) {
        studentStateResponse response = studentConversion.getClassState(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    /**
     * 学生加入课堂
     *
     * @param request
     * @param responseObserver
     */
    @Override
    public void addClass(addClassRequest request, StreamObserver<addClassResponse> responseObserver) {
        addClassResponse response = studentConversion.studentAddClass(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }


    @Override
    public void instructExperiment(instructExperimentRequest request, StreamObserver<instructExperimentResponse> responseObserver) {
        instructExperimentResponse response = studentConversion.instructExperiment(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
