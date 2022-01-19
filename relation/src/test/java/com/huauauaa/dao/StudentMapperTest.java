package com.huauauaa.dao;

import com.huauauaa.pojo.Student;
import com.huauauaa.utils.MybatisUtils;
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

        List<Student> students = studentMapper.getStudents();
        for (Student student : students) {
            System.out.println(student.getTeacher());
        }
    }
}
