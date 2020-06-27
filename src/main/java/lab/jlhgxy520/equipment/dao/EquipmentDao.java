package lab.jlhgxy520.equipment.dao;

import lab.jlhgxy520.equipment.po.Equipment;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Mapper
public interface EquipmentDao {

    @Insert("insert into equipments(equipment_id,class_id,time,number,state,school,class_number) values (#{equipment_id},#{class_id},#{time},#{number},#{state},#{school},#{class_number})")
    int insertEquipment(Equipment equipment);

    @Select("select * from equipments where class_id = #{class_id} and isdel = 0")
    List<Equipment> selectEquipmentByClassId(String class_id);

    @Select("select student_id from equipments where equipment_id = #{equipment_id} and isdel = 0")
    String selectStudentIdByEquipmentId(String equipment_id);

    @Delete("update equipments set isdel = 1 where equipment_id=#{equipment_id}")
    int removeEquipmentByEquipmentId(String equipment_id);

    @Delete("update equipments set isdel = 1 where class_id=#{class_id}")
    int removeEquipmentByClassId(String class_id);

    @Update("update equipments set state = #{state} where equipment_id = #{equipment_id} and isdel = 0")
    int updateState(int state, String equipment_id);

    @Select("select * from equipments where student_id = #{studentId} and isdel = 0")
    Equipment selectEuipmentByStudentId(String studentId);

    @Update("update equipments set student_id = #{student_id} where equipment_id = #{equipment_id} and isdel = 0")
    int updateStudentByEuqipmentId(String equipment_id, String student_id);

    @Update("update equipments set state = #{state},student_id = #{student_id} where class_id = #{classId} and isdel = 0")
    void resetState(String classId, int state, String student_id);

    @Select("select state from equipments where equipment_id = #{equipment_id} and isdel = 0")
    int selectStateByEquipmentId(String equipment_id);

    @Update("update equipments set start_time = #{start_time} where equipment_id = #{equipmentKey} and isdel = 0")
    void updateStartTimeByEquipmentId(long start_time,String equipmentKey);

    @Select("select start_time from equipments where equipment_id = #{equipmentKey} and isdel = 0")
    long selectStartTimeByEquipmentId(String equipmentKey);

    @Update("update equipments set equ_state = #{equ_state} where equipment_id = #{equipmentKey} and isdel = 0")
    void updateEquStateByEquipmentId(int equ_state,String equipmentKey);
    @Update("update equipments set rotate_future = #{rotate_future} where equipment_id = #{equipmentKey} and isdel = 0")
    void updateRotateFutureByEquipmentId(Double rotate_future,String equipmentKey);
    @Update("update equipments set exter_future = #{exter_future} where equipment_id = #{equipmentKey} and isdel = 0")
    void updateExterFutureByEquipmentId(Double exter_future,String equipmentKey);
    @Update("update equipments set core_future = #{core_future} where equipment_id = #{equipmentKey} and isdel = 0")
    void updateCoreFutureByEquipmentId(Double core_future,String equipmentKey);

    @Select("select equ_state from equipments where equipment_id = #{equipmentKey} and isdel = 0")
    int selectEquStateByEquipmentId(String equipmentKey);
    @Select("select rotate_future from equipments where equipment_id = #{equipmentKey} and isdel = 0")
    Double selectRotateFutureByEquipmentId(String equipmentKey);
    @Select("select exter_future from equipments where equipment_id = #{equipmentKey} and isdel = 0")
    Double selectExterFutureByEquipmentId(String equipmentKey);
    @Select("select core_future from equipments where equipment_id = #{equipmentKey} and isdel = 0")
    Double selectCoreFutureByEquipmentId(String equipmentKey);
}
