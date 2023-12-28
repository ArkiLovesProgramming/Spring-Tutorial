package com.arki;

import com.arki.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) context.getBean("Hello");
        System.out.println(hello);
    }
}
