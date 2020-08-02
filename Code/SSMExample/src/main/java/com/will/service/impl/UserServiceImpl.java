package com.will.service.impl;

import com.will.dao.UserDao;
import com.will.entity.User;
import com.will.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component注解说明:https://www.cnblogs.com/xinruyi/p/11160933.html
//@Component以及衍生出来的 @Service @Controller @Repository 相当于配置文件中的<bean id="userService" class="当前的类"/>
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void insertUser(User user) {

        System.out.println("service插入数据");
        userDao.insertUser(user);
    }

    @Override
    public List<User> queryAll() {
        System.out.println("service查询全部数据");
        return userDao.queryAll();

    }
}
