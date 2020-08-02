package com.zj.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 *
 * <bean id="user" class="...../user">
 *  <properties name="name"  value="张杰"></properties>
 * <properties name="age"  value="20"></properties>
 * </bean>
 */



public class User {


    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }
    @Value("张杰")
    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }
    @Value("20")
    public void setAge(Integer age) {
        this.age = age;
    }
}
