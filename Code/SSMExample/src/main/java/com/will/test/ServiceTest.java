package com.will.test;

import com.will.service.UserService;
import com.will.service.impl.UserServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

    @Test
    public void run() {
        //获取context上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //得到service对象
        UserService service = (UserService) context.getBean("userService");
        //调用测试
        service.queryAll();
//        也可以
//        UserServiceImpl service = (UserServiceImpl) context.getBean("userService");
//        service.queryAll();
    }

}
