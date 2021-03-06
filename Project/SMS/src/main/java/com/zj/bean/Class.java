package com.zj.bean;

import lombok.Data;

@Data
public class Class {
    //班级信息
    private Integer id;
    private String name;
    private String number;
    private String introducation;
    //班主任信息
    private String coordinator;
    private String telephone;
    private String email;
    //所属年级
    private String grade_name;

    public Class(String name, String grade_name) {
        this.name = name;
        this.grade_name = grade_name;
    }
}
