package com.zj.dao;

import com.zj.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserDaoImpl2 extends SqlSessionDaoSupport implements UserDao {

    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> users = mapper.selectUser();
        return null;
    }
}
