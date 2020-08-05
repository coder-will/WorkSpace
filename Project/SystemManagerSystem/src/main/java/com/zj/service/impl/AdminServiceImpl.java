package com.zj.service.impl;


import com.zj.bean.Admin;
import com.zj.bean.LoginForm;
import com.zj.dao.AdminMapper;
import com.zj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @project: sms
 * @description: 业务层实现类-操控管理员信息
 * @author: 黄宇辉
 * @date: 6/10/2019-3:52 PM
 * @version: 1.0
 * @website: https://yubuntu0109.github.io/
 */

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    //注入Mapper接口对象
    @Resource
    private AdminMapper adminMapper;

    @Override
    public Admin login(LoginForm loginForm) { return adminMapper.login(loginForm); }

    @Override
    public List<Admin> selectList(Admin admin) {
        return adminMapper.selectList(admin);
    }

    @Override
    public Admin findByName(String name) {
        return adminMapper.findByName(name);
    }

    @Override
    public int insert(Admin admin) {
        return adminMapper.insert(admin);
    }

    @Override
    public int update(Admin admin) { return adminMapper.update(admin); }

    @Override
    public int updatePassowrd(Admin admin) {
        return adminMapper.updatePassword(admin);
    }

    @Override
    public int deleteById(Integer[] ids) {
        return adminMapper.deleteById(ids);
    }

}

