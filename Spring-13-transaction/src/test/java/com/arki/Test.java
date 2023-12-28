package com.arki;

import com.arki.dao.UserMapper;
import com.arki.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("UserMapperImpl", UserMapper.class);
        ArrayList<User> users = userMapper.getUsers();
        System.out.println(users);
    }

    @org.junit.Test
    public void test2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("UserMapperImpl", UserMapper.class);
        userMapper.deleteUser("4");
        ArrayList<User> users = userMapper.getUsers();
        System.out.println(users);
    }

    //    测试有一个sql错误时
    @org.junit.Test
    public void test3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserMapper userMapper = applicationContext.getBean("UserMapperImpl", UserMapper.class);
        userMapper.addUser(new User("4", "arki", "233"));
        userMapper.deleteUser("4");
    }
}
