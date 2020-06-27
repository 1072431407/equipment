package lab.jlhgxy520.equipment.dao;


import lab.jlhgxy520.equipment.po.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface UserDao {
    @Select("select * from user where username = #{username}")
    User selectUserByUserName(String username);

    @Update("update user set password = #{password} where username = #{username}")
    int modifyPasswordByUserName(User user);

    @Insert("insert into user(id,username,password,power,field1,field2,school) values (#{id},#{username},#{password},#{power},#{field1},#{field2},#{school})")
    int insertUser(User user);

    @Update("update user set school = #{school},field1 = #{field1},field2 = #{field2} where id = #{id}")
    int alterUserByUserId(User user);

    @Select("select field1 from user where id = #{id}")//学生查姓名  教师查教室号
    String selectField1(String id);

    @Select("select field2 from user where id = #{id}")//学生查学号  教师IP
    String selectField2(String id);

    @Select("select * from user where power = #{power}")
    List<User> selectUserByPower(int power);

    @Select("select school from user where id = #{teacherId}")
    String selectSchool(String teacherId);

    @Delete("delete from user where id=#{id}")
    int removeTeacherById(String id);
}
