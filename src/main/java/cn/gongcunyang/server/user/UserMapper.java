package cn.gongcunyang.server.user;

import java.util.List;

public interface UserMapper {

    List<User> getAllUsers();

    User getUserById(int userId);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(int userId);

    User getUserByName(String userName);
}
