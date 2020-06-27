package lab.jlhgxy520.equipment.conversion;

import com.alibaba.fastjson.JSONObject;
import lab.jlhgxy520.equipment.po.ClassRoom;
import lab.jlhgxy520.equipment.po.Equipment;
import lab.jlhgxy520.equipment.po.Laboratory;
import lab.jlhgxy520.equipment.rpc.proto.admin.getClassResponse;
import lab.jlhgxy520.equipment.rpc.proto.teacher.*;
import lab.jlhgxy520.equipment.server.TeacherServer;
import lab.jlhgxy520.equipment.socket.ClientDevice;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class TeacherConversion {

    @Autowired
    private TeacherServer server;


    public List<getEquipmentResponse> getEquipmentList(getEquipmentRequest request) {
        List<Equipment> list = server.getEquipmentList(request.getClassId());
        List<getEquipmentResponse> listBeans = new ArrayList<>();
        if (list!=null){
            for (int i=0;i<list.size();i++){
                getEquipmentResponse response = getEquipmentResponse.newBuilder()
                        .setEquipmentId(list.get(i).getEquipment_id())
                        .setNumber(list.get(i).getNumber())
                        .setEquipmentState(list.get(i).getState())
                        .setStudentId(list.get(i).getStudent_id())
                        .setStudentName(list.get(i).getStudent_name())
                        .setCoreFuture(list.get(i).getCore_future())
                        .setExterFuture(list.get(i).getExter_future())
                        .setRotateFuture(list.get(i).getRotate_future())
                        .build();
                listBeans.add(response);
            }
        }else {
            getEquipmentResponse response = getEquipmentResponse.newBuilder()
                    .setState(State.FAILED)
                    .build();
            listBeans.add(response);
        }
        return listBeans;
    }

    public List<getLaboratoryResponse> getLaboratoryList(getLaboratoryRequest request) {
        List<Laboratory> list = server.getLaboratoryList(request.getTeacherId());
        List<getLaboratoryResponse> listBeans = new ArrayList<>();
        if (list!=null){
            for (int i=0;i<list.size();i++){
                getLaboratoryResponse response;
                if (list.get(i).getState() == 0){
                    response = getLaboratoryResponse.newBuilder()
                            .setClassId(list.get(i).getClass_id())
                            .setClassNumber(list.get(i).getClass_number())
                            .setEquipmentNumber(list.get(i).getEquipment_number()+"")
                            .setClassState(getLaboratoryResponse.ClassState.FINISH)
                            .build();
                }else {
                    response = getLaboratoryResponse.newBuilder()
                            .setClassId(list.get(i).getClass_id())
                            .setClassNumber(list.get(i).getClass_number())
                            .setEquipmentNumber(list.get(i).getEquipment_number()+"")
                            .setClassState(getLaboratoryResponse.ClassState.ATTEND)
                            .setClassCode(list.get(i).getClass_code())
                            .build();
                }
                listBeans.add(response);
            }
        }else {
            getLaboratoryResponse response = getLaboratoryResponse.newBuilder()
                    .setState(State.FAILED)
                    .build();
            listBeans.add(response);
        }
        return listBeans;
    }

    public attendClassResponse attendClass(attendClassRequest request) {
        String class_code = server.attendClass(request.getClassId());
        attendClassResponse response;
        if (class_code==null){
            response = attendClassResponse.newBuilder()
                    .setState(State.FAILED).build();
        }else {
            response = attendClassResponse.newBuilder()
                    .setState(State.SUCCEED)
                    .setClassCode(class_code)
                    .build();
        }
        return response;
    }

    public finishClassResponse finishClass(finishClassRequest request) {
        boolean key = server.finishClass(request.getClassId());
        if (key)
            return finishClassResponse.newBuilder().setState(State.SUCCEED).build();
        else
            return finishClassResponse.newBuilder().setState(State.FAILED).build();
    }
}
