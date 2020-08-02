package com.will.dao;

import com.will.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    @Insert("insert into user(name,age) values(#{name},${age})")
    public void insertUser(User user);

    @Select("select * from user")
    public List<User> queryAll();

}
