package lab.jlhgxy520.equipment.dao;

import lab.jlhgxy520.equipment.po.ClassRoom;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ClassRoomDao {
    @Select("select * from class_room where class_id=#{class_id}")
    List<ClassRoom> selectClassRoomByClassId(String class_id);

    @Insert("insert into class_room(class_id,school,class_number,class_ip,equipment_key,teacher_id) values (#{class_id},#{school},#{class_number},#{class_ip},#{equipment_key},#{teacher_id})")
    int insertClassRoom(ClassRoom item);

    @Select("select * from class_room where teacher_id=#{teacher_id}")
    List<ClassRoom> getClassStateByTeacherId(String teacher_id);

    @Select("select * from class_room where student_id=#{student_id}")
    ClassRoom getClassStateByStudentId(String student_id);

    @Delete("delete from class_room where equipment_key=#{key}")
    int removeEquipmentByKey(String key);

    @Delete("delete from class_room where class_id=#{class_id}")
    int removeClass(String class_id);

    @Update("update class_room set student_id = #{studentId} where equipment_key = #{key}")
    int toBoundStudent(String key, String studentId);
}
