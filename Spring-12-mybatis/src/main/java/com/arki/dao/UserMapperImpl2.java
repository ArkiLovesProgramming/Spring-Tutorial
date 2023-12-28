package com.arki.dao;

import com.arki.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{
    //不需要写set方法，直接可以注入sqlSession工厂
    @Override
    public User getUser(String id) {
        return getSqlSession().getMapper(UserMapper.class).getUser("1");
    }
}

