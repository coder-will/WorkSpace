package com.zj.service.impl;

import com.zj.bean.Admin;
import com.zj.bean.LoginForm;
import com.zj.dao.AdminMapper;
import com.zj.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    public Admin login(LoginForm loginForm) {
        return adminMapper.login(loginForm);
    }

    public Admin findByName(String name) {
        return adminMapper.findByName(name);
    }

    public int insert(Admin admin) {
        return adminMapper.insert(admin);
    }

    public List<Admin> selectList(Admin admin) {
        return adminMapper.selectList(admin);
    }

    public int update(Admin admin) {
        return adminMapper.update(admin);
    }

    public int updatePassword(Admin admin) {
        return adminMapper.updatePassword(admin);
    }

    public int deleteById(Integer[] ids) {
        return adminMapper.deleteById(ids);
    }
}
