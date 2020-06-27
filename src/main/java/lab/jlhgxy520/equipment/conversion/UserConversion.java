package lab.jlhgxy520.equipment.conversion;

import lab.jlhgxy520.equipment.po.User;
import lab.jlhgxy520.equipment.rpc.proto.user.*;
import lab.jlhgxy520.equipment.server.UserServer;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class UserConversion {

    @Autowired
    private UserServer userServer;
    /*
    power 权限
    1 表示用户
    2 表示管理员
     */
    public loginResponse userLogin(loginRequest request){
        String state = userServer.login(request.getUsername(),request.getPassword());
        if ("登录成功".equals(state)){
            User user = userServer.getUserByUserName(request.getUsername());
            loginResponse response = loginResponse.newBuilder()
                    .setState(state)
                    .setPower(user.getPower())
                    .setSchool(user.getSchool())
                    .setFiled1(user.getField1())
                    .setFiled2(user.getField2())
                    .setUuid(user.getId())
                    .build();
            ApplicationTools.logger.info("user login:"+request.getUsername()+","+request.getPassword()+"-->"+state);
            return response;
        }else{
            loginResponse response = loginResponse.newBuilder()
                    .setState(state)
                    .build();
            ApplicationTools.logger.info("user login:"+request.getUsername()+","+request.getPassword()+"-->"+state);
            return response;
        }
    }
/*
    注册成功
    该账号已存在
*/
    public registerResponse userRegister(registerRequest request) {
        User user = new User();
        user.setUsername(request.getUsername());
        user.setPassword(request.getPassword());
        user.setId(ApplicationTools.getUUID());
        user.setPower(request.getPower());
        user.setSchool(request.getSchool());
        user.setField1(request.getFiled1());
        user.setField2(request.getFiled2());
        String state = userServer.userRegister(user);
        registerResponse response = registerResponse.newBuilder()
                .setState(state)
                .build();
        ApplicationTools.logger.info("user register:"+request.getUsername()+","+request.getPassword()+","+request.getPower()+"-->"+state);
        return response;
    }
/*
    密码找回成功
    密码找回失败
    用户不存在
    您没有权限操作该账号
*/
    public upPasswordResponse upUserPassword(String username, String password) {
        String state = userServer.modifyPassword(username,password);
        upPasswordResponse response = upPasswordResponse.newBuilder()
                .setState(state).build();
        ApplicationTools.logger.info("user modify password:"+username+","+password+"-->"+state);
        return response;
    }

    public upMessageResponse alterUser(upMessageRequest request) {
        User user = new User();
        user.setId(request.getUuid());
        user.setSchool(request.getSchool());
        user.setField1(request.getFiled1());
        user.setField2(request.getFiled2());
        String state = userServer.alterUserByUserId(user);
        upMessageResponse response = upMessageResponse.newBuilder()
                .setState(state)
                .build();
        ApplicationTools.logger.info("user alter user:"+request.getUuid()+"-->"+state);
        return response;
    }
}
