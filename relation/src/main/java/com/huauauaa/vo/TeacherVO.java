package com.huauauaa.vo;

import com.huauauaa.pojo.Student;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class TeacherVO {

    private int id;
    private String name;
    private List<Student> students = new ArrayList<>();
}
