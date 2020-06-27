package lab.jlhgxy520.equipment.conversion;

import lab.jlhgxy520.equipment.po.EquipmentData;
import lab.jlhgxy520.equipment.po.EquipmentState;
import lab.jlhgxy520.equipment.rpc.proto.student.*;
import lab.jlhgxy520.equipment.server.StudentServer;
import lab.jlhgxy520.equipment.socket.ClientDevice;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
public class StudentConversion {

    @Autowired
    private StudentServer studentServer;

    public studentStateResponse getClassState(studentStateRequest request) {
        Map<String,String> map = studentServer.getClassState(request.getStudentId());
        if ("加入课堂".equals(map.get("state"))){
            studentStateResponse response = studentStateResponse.newBuilder()
                    .setState(map.get("state"))
                    .build();
            ApplicationTools.logger.info("student class state:"+"Student ID:"+request.getStudentId()+",state:"+map.get("state"));
            return response;
        }else {
            //回到课堂
            studentStateResponse response = studentStateResponse.newBuilder()
                    .setState(map.get("state"))
                    .setClassId(map.get("class_id"))
                    .setEquipmentKey(map.get("equipment_id"))
                    .setEquipmentNumber(map.get("equipment_number"))
                    .build();
            ApplicationTools.logger.info("student class state:"+"Student ID:"+request.getStudentId()+",state:"+map.get("state")+",class_id:"+map.get("class_id")+",equipment_id:"+map.get("equipment_id"));
            return response;
        }
    }

    public addClassResponse studentAddClass(addClassRequest request) {
        Map<String,String> map = studentServer.studentAddClass(request.getStudentId(),request.getClassCode());
        if ("加入成功".equals(map.get("state"))){
            addClassResponse response = addClassResponse.newBuilder()
                    .setState(map.get("state"))
                    .setClassId(map.get("class_id"))
                    .setEquipmentId(map.get("equipment_id"))
                    .setEquipmentNumber(map.get("equipment_number"))
                    .build();
            ApplicationTools.logger.info("student add class:"+"Class Code:"+request.getClassCode()+",state:"+map.get("state")+",equipment_ID:"+map.get("equipment_id")+",student_ID:"+request.getStudentId());
            return response;
        }else{
            addClassResponse response = addClassResponse.newBuilder()
                    .setState(map.get("state"))
                    .build();
            ApplicationTools.logger.info("student add class:"+"Class ID:"+request.getClassCode()+",state:"+map.get("state"));
            return response;
        }
    }

    public instructExperimentResponse instructExperiment(instructExperimentRequest request) {
        instructExperimentRequest.Instruct instruct = request.getInstruct();
//        ClientDevice clientDevice = ApplicationTools.clientsMap.get(request.getEquipmentKey());
        instructExperimentResponse response;
//        if (clientDevice == null){
//            studentServer.studentLost(request.getEquipmentKey());
//            response = instructExperimentResponse.newBuilder()
//                    .setState(instructExperimentResponse.State.FAILED)
//                    .build();
//            return response;
//        }

        switch (instruct){
            case OVER:
                if (studentServer.overExper(request.getEquipmentKey()))
                    response = instructExperimentResponse.newBuilder()
                            .setState(instructExperimentResponse.State.SUCCEED)
                            .build();
                else
                    response = instructExperimentResponse.newBuilder()
                            .setState(instructExperimentResponse.State.FAILED)
                            .build();
//                clientDevice.send("over");
                break;
            case START:
                if (studentServer.startExper(request.getEquipmentKey()))
                    response = instructExperimentResponse.newBuilder()
                            .setState(instructExperimentResponse.State.SUCCEED)
                            .build();
                else
                    response = instructExperimentResponse.newBuilder()
                            .setState(instructExperimentResponse.State.FAILED)
                            .build();
//                clientDevice.send("start");
                break;
            case INSTRUCT:
                if (studentServer.rotateExper(request.getEquipmentKey(),request.getStrInstruct()))
                    response = instructExperimentResponse.newBuilder()
                            .setState(instructExperimentResponse.State.SUCCEED)
                            .build();
                else
                    response = instructExperimentResponse.newBuilder()
                            .setState(instructExperimentResponse.State.FAILED)
                            .build();
                break;
            default:
                response = instructExperimentResponse.newBuilder()
                        .setState(instructExperimentResponse.State.FAILED)
                        .build();
        }
        return response;
    }

    /**
     *
     * @param request
     * @return 设备掉线 返回null
     */
    public List<realTimeResponse> realTimeData(realTimeRequest request) {
        List<EquipmentData> list = studentServer.getData(request.getStartTime(),request.getEquipmentKey(),request.getStudentId());
        List<realTimeResponse> listBeans = new ArrayList<>();
        if (list != null){
            for (int i=0;i<list.size();i++){
                realTimeResponse response = realTimeResponse.newBuilder()
                        .setRotate(list.get(i).getRotate())
                        .setCoreTemper(list.get(i).getCore_temper())
                        .setExterTemper(list.get(i).getExter_temper())
                        .setTime(list.get(i).getTime())
                        .setStartTime(list.get(i).getStart_time())
                        .setState(realTimeResponse.State.SUCCEED)
                        .build();
                listBeans.add(response);
            }
        }else {
            realTimeResponse response = realTimeResponse.newBuilder()
                    .setState(realTimeResponse.State.FAILED)
                    .build();
            listBeans.add(response);
        }
        return listBeans;
    }

    public EquipmentStateResponse getEquipmentState(EquipmentStateRequest request) {
        EquipmentState equipmentState = studentServer.getEquipmentState(request.getEquipmentId());
        EquipmentStateResponse response = EquipmentStateResponse.newBuilder()
                .setCoreFuture(equipmentState.getCore_future())
                .setExterFuture(equipmentState.getExter_future())
                .setRotateFuture(equipmentState.getRotate_future())
                .setEquState(equipmentState.getEqu_state())
                .build();
        return response;
    }
}
