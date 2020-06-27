package lab.jlhgxy520.equipment.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import lab.jlhgxy520.equipment.rpc.proto.student.StudentRpcServerGrpc;
import lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentRequest;
import lab.jlhgxy520.equipment.rpc.proto.student.instructExperimentResponse;
import lab.jlhgxy520.equipment.tools.ApplicationTools;

/**
 * 学生手机端
 */
public class AndroidClient {
    private static String IP = ApplicationTools.SERVER_IP;
    private static int PORT = ApplicationTools.GRPC_PORT;
    public static void main(String[] args) {
//        stub.send(sendRequest.newBuilder().setName(UUID).setAge("unbound").build());
        /**
         * 读取数据
         */
//        while (true){
//            instructExperimentResponse response = instructBlock(instructExperimentRequest.Instruct.GET_DATA,"f4f91c54e54e48cb87961ab2913f82b5","39f7d4c251b443d5a6b653119ad8ab94");
//            System.out.println(response.getData());
//        }
    }
    public static instructExperimentResponse instructBlock(instructExperimentRequest.Instruct instruct, String equipment_key, String student_id){
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress(IP, PORT)
                .usePlaintext().build();
        StudentRpcServerGrpc.StudentRpcServerBlockingStub blockingStub = StudentRpcServerGrpc.newBlockingStub(managedChannel);

        instructExperimentRequest request = instructExperimentRequest.newBuilder()
                .setEquipmentKey(equipment_key)
                .setStudentId(student_id)
                .setInstruct(instruct)
                .build();
        return blockingStub.instructExperiment(request);
    }
}
