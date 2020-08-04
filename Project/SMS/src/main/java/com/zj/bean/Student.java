package com.zj.bean;

import lombok.Data;

@Data
public class Student {
    private Integer id;
    private String sno;
    private String name;
    private char gender = '男'; //default
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String introducation;
    private String portrain_path; //存储头像的路径
    private String class_name; //班级名称

    public Student(String name, String class_name) {
        this.name = name;
        this.class_name = class_name;
    }
}
