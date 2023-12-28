package com.arki.dao;

import com.arki.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.ArrayList;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
    //继承了SqlSessionDaoSupport这个，就不需要手动写代码注入sqlSession
    @Override
    public ArrayList<User> getUsers() {
        return getSqlSession().getMapper(UserMapper.class).getUsers();
    }

    @Override
    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    @Override
    public int deleteUser(String id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
