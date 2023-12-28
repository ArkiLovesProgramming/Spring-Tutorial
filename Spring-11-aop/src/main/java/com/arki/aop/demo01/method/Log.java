package com.arki.aop.demo01.method;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class Log implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("[debug]" + target.getClass().getName() +  "执行了" + method.getName() + "方法");
    }
}
