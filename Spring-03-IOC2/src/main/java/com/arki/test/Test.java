package com.arki.test;

import com.arki.pojo.UserDaoSqlserverImpl;
import com.arki.service.UserService;
import com.arki.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        UserServiceImpl userService = new UserServiceImpl();
        //ioc理论
        userService.setUserDao(new UserDaoSqlserverImpl());
        userService.getUserByUserService();
    }

    //通过spring进行di操作
    @org.junit.Test
    public void test2(){
        // 获取ApplicationContext：拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // 通过容器获取对象，而不是通过new
        UserService userService = (UserService) context.getBean("UserServiceImpl");
        userService.getUserByUserService();
    }
}
