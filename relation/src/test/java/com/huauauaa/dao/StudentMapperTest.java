package com.huauauaa.dao;

import com.huauauaa.utils.MybatisUtils;
import com.huauauaa.vo.StudentVO;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentMapperTest {


    private SqlSession sqlSession;
    private StudentMapper studentMapper;

    @Before
    public void before() {
        sqlSession = MybatisUtils.getSqlSession();
        studentMapper = sqlSession.getMapper(StudentMapper.class);
    }

    @After
    public void after() {
        sqlSession.close();
    }

    @Test
    public void testGetStudents() {

        List<StudentVO> students = studentMapper.getStudents();
        students.forEach(System.out::println);
    }
}
