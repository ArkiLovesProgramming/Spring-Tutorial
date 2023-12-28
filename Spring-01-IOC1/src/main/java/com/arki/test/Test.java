package com.arki.test;

import com.arki.pojo.UserDaoSqlserverImpl;
import com.arki.service.UserServiceImpl;

public class Test {

    @org.junit.Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
        //ioc理论
        userService.setUserDao(new UserDaoSqlserverImpl());
        userService.getUserByUserService();
    }
}
