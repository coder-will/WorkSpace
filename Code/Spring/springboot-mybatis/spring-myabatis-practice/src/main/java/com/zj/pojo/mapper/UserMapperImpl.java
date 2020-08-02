package com.zj.pojo.mapper;

import com.zj.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> select() {
        List<User> user1 = sqlSession.getMapper(UserMapper.class).select();
        for (User user : user1) {
            System.out.println(user);

        }
        return null;
    }
}
