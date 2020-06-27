package lab.jlhgxy520.equipment.conversion;

import lab.jlhgxy520.equipment.po.AdminTeacher;
import lab.jlhgxy520.equipment.po.Equipment;
import lab.jlhgxy520.equipment.po.Laboratory;
import lab.jlhgxy520.equipment.rpc.proto.admin.*;
import lab.jlhgxy520.equipment.server.AdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AdminConversion {
    @Autowired
    private AdminServer adminServer;

    /**
     * 获取教师信息
     * @return
     */
    public List<getTeacherResponse> getTeacherList() {
        List<AdminTeacher> list = adminServer.getTeacherList();
        List<getTeacherResponse> listBeans = new ArrayList<>();
        if (list!=null){
            for (int i=0;i<list.size();i++){
                getTeacherResponse response = getTeacherResponse.newBuilder()
                        .setClassNumber(list.get(i).getClass_number())
                        .setTeacherId(list.get(i).getTeacher_id())
                        .setSchool(list.get(i).getSchool())
                        .setName(list.get(i).getName())
                        .setNumber(list.get(i).getNumber())
                        .setState(getTeacherResponse.State.SUCCEED)
                        .build();
                listBeans.add(response);
            }
        }else {
            getTeacherResponse response = getTeacherResponse.newBuilder()
                    .setState(getTeacherResponse.State.FAILED)
                    .build();
            listBeans.add(response);
        }
        return listBeans;
    }

    public List<getClassResponse> getLaboratoryList(getClassRequest request) {
        List<Laboratory> list = adminServer.getLaboratoryList(request.getTeacherId());
        List<getClassResponse> listBeans = new ArrayList<>();
        if (list!=null){
            for (int i=0;i<list.size();i++){
                getClassResponse response = getClassResponse.newBuilder()
                        .setClassNumber(list.get(i).getClass_number())
                        .setSchool(list.get(i).getSchool())
                        .setClassId(list.get(i).getClass_id())
                        .setEquipmentNumber(list.get(i).getEquipment_number()+"")
                        .setState(getClassResponse.State.SUCCEED)
                        .build();
                listBeans.add(response);
            }
        }else {
            getClassResponse response = getClassResponse.newBuilder()
                    .setState(getClassResponse.State.FAILED)
                    .build();
            listBeans.add(response);
        }
        return listBeans;
    }

    public addClassResponse addLaboratory(addClassRequest request) {
        Laboratory laboratory = adminServer.addLaboratory(request.getClassNumber(),request.getTeacherId());
        if (laboratory != null){
            return addClassResponse.newBuilder()
                    .setClassNumber(laboratory.getClass_number())
                    .setSchool(laboratory.getSchool())
                    .setClassId(laboratory.getClass_id())
                    .setEquipmentNumber(laboratory.getEquipment_number()+"")
                    .setState(addClassResponse.State.SUCCEED)
                    .build();
        }else
            return addClassResponse.newBuilder().setState(addClassResponse.State.FAILED).build();
    }



    public addEquipmentResponse addEquipment(addEquipmentRequest request) {
        Equipment equipment = adminServer.addEquipment(request.getClassId(),request.getTime(),request.getEquipmentNumber());
        if (equipment != null){
            return addEquipmentResponse.newBuilder()
                    .setClassId(equipment.getClass_id())
                    .setEquipmentId(equipment.getEquipment_id())
                    .setEquipmentNumber(equipment.getNumber())
                    .setTime(equipment.getTime())
                    .setState(addEquipmentResponse.State.SUCCEED)
                    .build();
        }else
            return addEquipmentResponse.newBuilder().setState(addEquipmentResponse.State.FAILED).build();
    }

    public List<getEquipmentResponse> getEquipmentList(getEquipmentRequest request) {
        List<Equipment> list = adminServer.getEquipmentList(request.getClassId());
        List<getEquipmentResponse> listBeans = new ArrayList<>();
        if (list!=null){
            for (int i=0;i<list.size();i++){
                getEquipmentResponse response = getEquipmentResponse.newBuilder()
                        .setClassId(list.get(i).getClass_id())
                        .setEquipmentId(list.get(i).getEquipment_id())
                        .setEquipmentNumber(list.get(i).getNumber())
                        .setTime(list.get(i).getTime())
                        .setState(getEquipmentResponse.State.SUCCEED)
                        .build();
                listBeans.add(response);
            }
        }else {
            getEquipmentResponse response = getEquipmentResponse.newBuilder()
                    .setState(getEquipmentResponse.State.FAILED)
                    .build();
            listBeans.add(response);
        }
        return listBeans;
    }


    public removeTeacherResponse removeTeacher(removeTeacherRequest request) {
        if (adminServer.removeTeacher(request.getTeacherId()))
            return removeTeacherResponse.newBuilder().setState(removeTeacherResponse.State.SUCCEED).build();
        else
            return removeTeacherResponse.newBuilder().setState(removeTeacherResponse.State.FAILED).build();
    }
    public removeClassResponse removeLaboratory(removeClassRequest request) {
        if (adminServer.removeLaboratory(request.getClassId()))
            return removeClassResponse.newBuilder().setState(removeClassResponse.State.SUCCEED).build();
        else
            return removeClassResponse.newBuilder().setState(removeClassResponse.State.FAILED).build();
    }
    public removeEquipmentResponse removeEquipment(removeEquipmentRequest request) {
        if (adminServer.removeEquipment(request.getEquipmentId()))
            return removeEquipmentResponse.newBuilder().setState(removeEquipmentResponse.State.SUCCEED).build();
        else
            return removeEquipmentResponse.newBuilder().setState(removeEquipmentResponse.State.FAILED).build();
    }
}
