package com.huauauaa.dao;

import com.huauauaa.pojo.User;
import com.huauauaa.utils.MybatisUtils;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {

    SqlSession sqlSession = MybatisUtils.getSqlSession();

    // option1
    UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
    List<User> userList = userMapper.getUserList();
    
    // option2
//    List<User> userList = sqlSession.selectList("com.huauauaa.dao.UserMapper.getUserList");

    @Test
    public void test() {
        userList.forEach(System.out::println);
    }
}
