package com.arki;

import com.arki.dao.UserMapper;
import com.arki.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
        User user = userMapper.getUser("1");
        System.out.println(user);
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
        User user = userMapper.getUser("1");
        System.out.println(user);
    }

}
