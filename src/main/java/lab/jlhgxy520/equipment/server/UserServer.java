package lab.jlhgxy520.equipment.server;

import lab.jlhgxy520.equipment.po.User;

public interface UserServer {
    String login(String username, String password);

    String modifyPassword(String username, String password);

    String userRegister(User user);

    User getUserByUserName(String username);

    String alterUserByUserId(User user);
}
