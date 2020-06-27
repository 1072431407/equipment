package lab.jlhgxy520.equipment.rpc.server;

import io.grpc.stub.StreamObserver;
import lab.jlhgxy520.equipment.conversion.TeacherConversion;
import lab.jlhgxy520.equipment.rpc.proto.teacher.*;
import lab.jlhgxy520.equipment.socket.ClientDevice;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import lab.jlhgxy520.equipment.tools.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GrpcService
public class TeacherGrpcServer extends TeacherRpcServerGrpc.TeacherRpcServerImplBase {

    @Autowired
    private TeacherConversion conversion;

    @Override
    public void finishClass(finishClassRequest request, StreamObserver<finishClassResponse> responseObserver) {
        finishClassResponse response = conversion.finishClass(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void attendClass(attendClassRequest request, StreamObserver<attendClassResponse> responseObserver) {
        attendClassResponse response = conversion.attendClass(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getEquipmentList(getEquipmentRequest request, StreamObserver<getEquipmentResponse> responseObserver) {
        List<getEquipmentResponse> listBeans = conversion.getEquipmentList(request);
        for (getEquipmentResponse item:listBeans)
            responseObserver.onNext(item);
        responseObserver.onCompleted();
    }

    @Override
    public void getLaboratoryList(getLaboratoryRequest request, StreamObserver<getLaboratoryResponse> responseObserver) {
        List<getLaboratoryResponse> listBeans = conversion.getLaboratoryList(request);
        for (getLaboratoryResponse item:listBeans)
            responseObserver.onNext(item);
        responseObserver.onCompleted();
    }
}
