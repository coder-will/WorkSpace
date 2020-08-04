package com.zj.service.impl;

import com.zj.bean.LoginForm;
import com.zj.bean.Student;
import com.zj.dao.StudentMapper;
import com.zj.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    public Student login(LoginForm loginForm) {
        return studentMapper.login(loginForm);
    }

    public List<Student> selectList(Student student) {
        return studentMapper.selectList(student);
    }

    public Student findBySno(Student student) {
        return studentMapper.findBySno(student);
    }

    public int insert(Student student) {
        return studentMapper.insert(student);
    }

    public int update(Student student) {
        return studentMapper.update(student);
    }

    public int updatePassword(Student student) {
        return studentMapper.updatePassword(student);
    }

    public int deleteById(Integer[] ids) {
        return studentMapper.deleteById(ids);
    }
}
