package com.arki.dao;

import com.arki.pojo.User;
import org.apache.ibatis.session.SqlSession;

public class UserMapperImpl implements UserMapper{
    private SqlSession session;

    public void setSession(SqlSession session){
        this.session = session;
    }
    @Override
    public User getUser(String id) {
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.getUser(id);
        return user;
    }
}
