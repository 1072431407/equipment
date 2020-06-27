package lab.jlhgxy520.equipment.rpc.server;

import io.grpc.stub.StreamObserver;
import lab.jlhgxy520.equipment.conversion.AdminConversion;
import lab.jlhgxy520.equipment.rpc.proto.admin.*;
import lab.jlhgxy520.equipment.tools.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@GrpcService
public class AdminGrpcServer extends AdminRpcServerGrpc.AdminRpcServerImplBase {
    @Autowired
    private AdminConversion conversion;

    @Override
    public void adminAddEquipment(addEquipmentRequest request, StreamObserver<addEquipmentResponse> responseObserver) {
        addEquipmentResponse response = conversion.addEquipment(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void adminGetEquipmentList(getEquipmentRequest request, StreamObserver<getEquipmentResponse> responseObserver) {
        List<getEquipmentResponse> listBeans = conversion.getEquipmentList(request);
        for (getEquipmentResponse item:listBeans)
            responseObserver.onNext(item);
        responseObserver.onCompleted();
    }

    @Override
    public void adminRemoveEquipment(removeEquipmentRequest request, StreamObserver<removeEquipmentResponse> responseObserver) {
        removeEquipmentResponse response = conversion.removeEquipment(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }



    @Override
    public void adminAddClass(addClassRequest request, StreamObserver<addClassResponse> responseObserver) {
        addClassResponse response = conversion.addLaboratory(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void adminRemoveClass(removeClassRequest request, StreamObserver<removeClassResponse> responseObserver) {
        removeClassResponse response = conversion.removeLaboratory(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void adminGetClassList(getClassRequest request, StreamObserver<getClassResponse> responseObserver) {
        List<getClassResponse> listBeans = conversion.getLaboratoryList(request);
        for (getClassResponse item:listBeans)
            responseObserver.onNext(item);
        responseObserver.onCompleted();
    }




    @Override
    public void adminGetTeacherList(getTeacherRequest request, StreamObserver<getTeacherResponse> responseObserver) {
        List<getTeacherResponse> listBeans = conversion.getTeacherList();
        for (getTeacherResponse item:listBeans)
            responseObserver.onNext(item);
        responseObserver.onCompleted();
    }

    @Override
    public void adminRemoveTeacher(removeTeacherRequest request, StreamObserver<removeTeacherResponse> responseObserver) {
        removeTeacherResponse response = conversion.removeTeacher(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
