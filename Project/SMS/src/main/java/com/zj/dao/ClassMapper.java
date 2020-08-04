package com.zj.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

public interface ClassMapper {
    // 根据班级名称获取指定/全部班级信息列表
    List<com.zj.bean.Class> selectList(com.zj.bean.Class clazz);

    // 查询所有班级列表信息(用于在学生管理页面中获取班级信息)
    List<com.zj.bean.Class> selectAll();

    // 获取指定名称的班级信息
    com.zj.bean.Class findByName(String name);

    // 添加班级信息
    int insert(com.zj.bean.Class clazz);

    // 根据id删除指定班级信息
    int deleteById(Integer[] ids);

    // 根据id修改指定班级信息
    int update(com.zj.bean.Class clazz);
}
