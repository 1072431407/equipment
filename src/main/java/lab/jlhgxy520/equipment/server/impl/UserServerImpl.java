package lab.jlhgxy520.equipment.server.impl;




import lab.jlhgxy520.equipment.dao.UserDao;
import lab.jlhgxy520.equipment.po.User;
import lab.jlhgxy520.equipment.server.UserServer;
import lab.jlhgxy520.equipment.tools.ApplicationTools;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl implements UserServer {
    @Autowired
    private UserDao userDao;

    @Override
    public String login(String username, String password) {
        User user = userDao.selectUserByUserName(username);
        if (user == null)
            return "用户不存在";
        if (password.equals(user.getPassword()))
            return "登录成功";
        else
            return "密码错误";
    }

    @Override
    public String modifyPassword(String username, String password) {
        User user = userDao.selectUserByUserName(username);
        if (user == null)
            return "用户不存在";
        user.setPassword(password);
        int key = userDao.modifyPasswordByUserName(user);
        if (key>0)
            return "找回密码成功";
        else
            return "找回密码失败";
    }
    /*
        注册成功
        该账号已存在
    */
    @Override
    public String userRegister(User user) {
        User newUser = userDao.selectUserByUserName(user.getUsername());
        if (newUser!=null)
            return "该账号已存在";
        else{

            int key = userDao.insertUser(user);
            if (key>0)
                return "注册成功";
            else
                return "注册失败";
        }
    }

    @Override
    public User getUserByUserName(String username) {
        return userDao.selectUserByUserName(username);
    }

    @Override
    public String alterUserByUserId(User user) {
        int key = userDao.alterUserByUserId(user);
        if (key>0)
            return "保存成功";
        else
            return "保存失败";
    }

}
