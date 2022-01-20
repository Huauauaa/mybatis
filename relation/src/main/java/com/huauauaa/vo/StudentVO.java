package com.huauauaa.vo;

import com.huauauaa.pojo.Teacher;
import lombok.Data;

@Data
public class StudentVO {

    private int id;
    private String name;
    private Teacher teacher;
}
