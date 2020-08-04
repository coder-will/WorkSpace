package com.zj.bean;

import lombok.Data;

@Data
public class Teacher {

    private Integer id;
    private String tno;
    private String name;
    private char gender;
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String class_name;
    private String portrait_path;//存储头像的项目路径

    public Teacher(String name, String class_name) {
        this.name = name;
        this.class_name = class_name;
    }
}
