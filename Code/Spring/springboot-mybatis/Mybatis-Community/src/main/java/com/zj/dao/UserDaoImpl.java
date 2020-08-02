package com.zj.dao;

import com.zj.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 *
 *
 */
public class UserDaoImpl implements UserDao {
    //SqlSessionTemplate 不用我们自己创建了，Spring来管理
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSession(SqlSessionTemplate sqlSessionTemplate){
        this.sqlSessionTemplate=sqlSessionTemplate;
    }

    public List<User> selectUser() {
        UserDao mapper = sqlSessionTemplate.getMapper(UserDao.class);

        return mapper.selectUser();
    }
}
