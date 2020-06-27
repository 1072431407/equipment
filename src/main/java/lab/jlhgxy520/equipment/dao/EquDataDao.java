package lab.jlhgxy520.equipment.dao;

import lab.jlhgxy520.equipment.po.EquipmentData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface EquDataDao {
    @Insert("insert into equ_data(time,rotate,core_temper,exter_temper,equipment_id,start_time) values (#{time},#{rotate},#{core_temper},#{exter_temper},#{equipment_id},#{start_time})")
    int insertEquipmentData(EquipmentData equipment);

    @Select("select time,rotate,core_temper,exter_temper,start_time from equ_data where equipment_id = #{equipment_id} and time>=#{time}")
    List<EquipmentData> selectEquipmentData(String equipment_id,long time);
}
