package com.huauauaa.dao;

import com.huauauaa.pojo.User;
import java.util.List;

public interface UserMapper {

    /**
     * get users
     *
     * @return
     */
    List<User> getUserList();
}
