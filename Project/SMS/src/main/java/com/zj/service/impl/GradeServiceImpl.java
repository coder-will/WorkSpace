package com.zj.service.impl;

import com.zj.bean.Grade;
import com.zj.dao.GradeMapper;
import com.zj.service.GradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GradeServiceImpl implements GradeService {
    @Autowired
    private GradeMapper gradeMapper;

    public void setGradeMapper(GradeMapper gradeMapper) {
        this.gradeMapper = gradeMapper;
    }

    public List<Grade> selectList(Grade gradename) {
        return gradeMapper.selectList(gradename);
    }

    public List<Grade> selectAll() {
        return gradeMapper.selectAll();
    }

    public Grade findByName(String gradename) {
        return gradeMapper.findByName(gradename);
    }

    public int insert(Grade grade) {
        return gradeMapper.insert(grade);
    }

    public int update(Grade grade) {
        return gradeMapper.update(grade);
    }

    public int deleteById(Integer[] ids) {
        return gradeMapper.deleteById(ids);
    }
}
