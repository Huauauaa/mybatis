package com.huauauaa.dao;

import com.huauauaa.pojo.User;
import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUserList();

    User getUserById(int id);

    int addUser(User user);

    int addUserViaMap(Map<String, Object> map);

    int updateUser(User user);

    int deleteUser(int id);

}
