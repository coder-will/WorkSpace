package com.zj.service.impl;

import com.zj.bean.LoginForm;
import com.zj.bean.Teacher;
import com.zj.dao.TeacherMapper;
import com.zj.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    public Teacher login(LoginForm loginForm) {
        return teacherMapper.login(loginForm);
    }

    public List<Teacher> selectList(Teacher teacher) {
        return teacherMapper.selectList(teacher);
    }

    public Teacher findByTno(Teacher teacher) {
        return teacherMapper.findByTno(teacher);
    }

    public int insert(Teacher teacher) {
        return teacherMapper.insert(teacher);
    }

    public int update(Teacher teacher) {
        return teacherMapper.update(teacher);
    }

    public int updatePassword(Teacher teacher) {
        return teacherMapper.updatePassword(teacher);
    }

    public int deleteById(Integer[] ids) {
        return teacherMapper.deleteById(ids);
    }
}
