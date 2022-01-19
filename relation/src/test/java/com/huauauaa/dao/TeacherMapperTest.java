package com.huauauaa.dao;

import com.huauauaa.pojo.Teacher;
import com.huauauaa.utils.MybatisUtils;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TeacherMapperTest {

    private SqlSession sqlSession;
    private TeacherMapper mapper;

    @Before
    public void before() {
        sqlSession = MybatisUtils.getSqlSession();
        mapper = sqlSession.getMapper(TeacherMapper.class);
    }

    @After
    public void after() {
        sqlSession.close();
    }

    @Test
    public void testGetStudents() {
        List<Teacher> teachers = mapper.getTeachers();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
