package com.huauauaa.dao;

import com.huauauaa.pojo.User;
import com.huauauaa.utils.MybatisUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserMapperTest {

    private SqlSession sqlSession;
    private UserMapper userMapper;

    @Before
    public void before() {
        sqlSession = MybatisUtils.getSqlSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }


    @After
    public void after() {
        sqlSession.close();
    }

    @Test
    public void testSelect() {

        List<User> userList = userMapper.getUserList();

        // option2
//    List<User> userList = sqlSession.selectList("com.huauauaa.dao.UserMapper.getUserList");
        userList.forEach(System.out::println);
    }

    @Test
    public void testSelectOne() {
        User user = userMapper.getUserById(0);
        User user1 = userMapper.getUserById(1);

        Assert.assertNotNull(user);
        Assert.assertEquals(user1, null);
    }


    @Test
    public void testAdd() {
        User user = new User(1, "Harvey", "123");
        userMapper.addUser(user);
        sqlSession.commit();
    }

    @Test
    public void testAddViaMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("userId", 2);
        map.put("username", "Martin");
        userMapper.addUserViaMap(map);
        sqlSession.commit();
    }

    @Test
    public void testUpdate() {
        User user = new User(4, "bqq88qb", "bb");
        Integer result = userMapper.updateUser(user);
        System.out.println(result);
        sqlSession.commit();
    }

    @Test
    public void testDelete() {
        userMapper.deleteUser(2);
        sqlSession.commit();
    }

}
