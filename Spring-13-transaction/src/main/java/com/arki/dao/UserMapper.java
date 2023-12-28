package com.arki.dao;

import com.arki.pojo.User;

import java.util.ArrayList;

public interface UserMapper {
    ArrayList<User> getUsers();

    int addUser(User user);//一个参数随便要不要注解

    int deleteUser(String id);
}
