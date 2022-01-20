package com.huauauaa.dao;

import com.huauauaa.utils.MybatisUtils;
import com.huauauaa.vo.TeacherVO;
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
    public void testGetTeachers() {
        List<TeacherVO> teachers = mapper.getTeachers();
        for (TeacherVO teacher : teachers) {
            System.out.println(teacher);
        }
    }
}
