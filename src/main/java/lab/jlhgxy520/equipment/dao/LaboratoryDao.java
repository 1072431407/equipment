package lab.jlhgxy520.equipment.dao;

import lab.jlhgxy520.equipment.po.Laboratory;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@Mapper
public interface LaboratoryDao {

    @Select("select * from laboratory where teacher_id = #{teacher_id} and isdel = 0")
    List<Laboratory> selectLaboratoryByTeacherId(String teacher_id);

    @Insert("insert into laboratory(class_id,class_number,teacher_id,school,state) values (#{class_id},#{class_number},#{teacher_id},#{school},#{state})")
    int insertLaboratory(Laboratory laboratory);

    @Select("select school from laboratory where class_id = #{class_id} and isdel = 0")
    String selectSchoolByClassId(String class_id);

    @Select("select class_number from laboratory where class_id = #{class_id} and isdel = 0")
    String selectClassNumberByClassId(String class_id);

    @Delete("update laboratory set isdel = 1 where class_id=#{class_id}")
    int removeClassByClassId(String class_id);

    @Update("update laboratory set state = #{state},class_code = #{class_code} where class_id = #{classId} and isdel = 0")
    int updateClassState(String classId, int state, String class_code);

    @Select("select * from laboratory where class_code = #{class_code} and isdel = 0")
    Laboratory selectLaboratoryClassCode(String class_code);
}
