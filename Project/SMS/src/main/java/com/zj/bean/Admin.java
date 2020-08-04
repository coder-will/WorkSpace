package com.zj.bean;

import lombok.Data;

@Data
public class Admin {
    private Integer id;
    private String name;
    private char gender;
    private String password;
    private String email;
    private String telephone;
    private String address;
    private String portrain_path; //存储头像的项目路径

}
