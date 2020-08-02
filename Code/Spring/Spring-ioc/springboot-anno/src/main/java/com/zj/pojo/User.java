package com.zj.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//等价于<bean id="user" class="com.zj.pojo.User"/>
@Component
public class User {
    @Value("bababababa")
    public String name;

}
