package com.arki.aop.demo02.method;

public class diyPointcutAdvice {
    public void before(){
        System.out.println("=============方法执行前===========");
    }

    public void after(){
        System.out.println("=============方法执行后===========");
    }
}
