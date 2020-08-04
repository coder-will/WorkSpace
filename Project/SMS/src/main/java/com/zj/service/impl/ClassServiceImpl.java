package com.zj.service.impl;

import com.zj.bean.Class;
import com.zj.dao.ClassMapper;
import com.zj.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class ClassServiceImpl implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    public void setClassMapper(ClassMapper classMapper) {
        this.classMapper = classMapper;
    }

    public List<Class> selectList(Class clazz) {
        return classMapper.selectList(clazz);
    }

    public List<Class> selectAll() {
        return classMapper.selectAll();
    }

    public Class findByName(String name) {
        return classMapper.findByName(name);
    }

    public int insert(Class clazz) {
        return classMapper.insert(clazz);
    }

    public int deleteById(Integer[] ids) {
        return classMapper.deleteById(ids);
    }

    public int update(Class clazz) {
        return classMapper.update(clazz);
    }
}
