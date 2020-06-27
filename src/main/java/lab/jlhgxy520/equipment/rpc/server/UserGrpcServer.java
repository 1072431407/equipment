package lab.jlhgxy520.equipment.rpc.server;

import io.grpc.stub.StreamObserver;
import lab.jlhgxy520.equipment.conversion.UserConversion;
import lab.jlhgxy520.equipment.rpc.proto.user.*;
import lab.jlhgxy520.equipment.tools.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GrpcService
public class UserGrpcServer extends UserRpcServerGrpc.UserRpcServerImplBase {
    @Autowired
    private UserConversion conversion;

    @Override
    public void login(loginRequest request, StreamObserver<loginResponse> responseObserver) {
        loginResponse response = conversion.userLogin(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void register(registerRequest request, StreamObserver<registerResponse> responseObserver) {
        registerResponse response = conversion.userRegister(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void upPassword(upPasswordRequest request, StreamObserver<upPasswordResponse> responseObserver) {
        upPasswordResponse response = conversion.upUserPassword(request.getUsername(),request.getPassword());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void upMessage(upMessageRequest request, StreamObserver<upMessageResponse> responseObserver) {
        upMessageResponse response = conversion.alterUser(request);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
