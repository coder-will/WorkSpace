package com.will.controller;

import com.will.entity.User;
import com.will.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/queryAll")
    public String queryAll(Model model) {
        System.out.println("controller查询全部数据");
        //使用注入的userService来调用queryAll方法
        List<User> users = userService.queryAll();
        model.addAttribute("msg", users);
        return "success";
    }

    @RequestMapping("/insert")
    public String insertUser(User user) {
        System.out.println("controller插入数据");
        userService.insertUser(user);
        return "success";
    }

}
