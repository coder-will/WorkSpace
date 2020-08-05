package com.springbootproject.pojo;

import java.util.Date;

public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    //1 male, 0 female
    private Integer gender;
    private Integer department;
    private Date birth;
    private Department eDepartment;
}
