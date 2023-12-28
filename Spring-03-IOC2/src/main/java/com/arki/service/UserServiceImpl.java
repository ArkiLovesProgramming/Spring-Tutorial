package com.arki.service;

import com.arki.pojo.UserDao;

public class UserServiceImpl implements UserService{
    //传统的方案
    //private UserDao userDao = new UserDaoMysqlImpl();
    //ioc理论: 通过用户去自行决定注入什么实现类, 通过set去注入
    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void getUserByUserService() {
        userDao.getUser();
    }
}
