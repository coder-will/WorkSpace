package com.zj.dao;

import com.zj.bean.Admin;
import com.zj.bean.LoginForm;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 数据库访问层 - 操控管理员信息
 */

public interface AdminMapper {
//    验证登录信息是否正确
    Admin login(LoginForm loginForm);
//    通过姓名查询指定管理员信息
    Admin findByName(String name);
//    添加管理员信息
    int insert(Admin admin);
//    根据姓名查询指定或所有管理员信息列表
    List<Admin> selectList(Admin admin);
//    根据id更新指定管理员信息
    int update(Admin admin);
//    根据id修改指定管理员密码
    int updatePassword(Admin admin);
//    根据Id删除指定管理员信息
    int deleteById(Integer[] ids);
}
