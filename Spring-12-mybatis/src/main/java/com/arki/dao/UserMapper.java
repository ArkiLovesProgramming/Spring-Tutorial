package com.arki.dao;

import com.arki.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    public User getUser(@Param("uid") String id);
}
