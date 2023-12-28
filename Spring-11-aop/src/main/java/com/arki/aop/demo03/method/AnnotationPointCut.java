package com.arki.aop.demo03.method;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnotationPointCut {
    @Before("execution(* com.arki.aop.demo03.UserServiceImpl.*(..))")
    public void before(){
        System.out.println("Before method executes");
    }

    @After("execution(* com.arki.aop.demo03.UserServiceImpl.*(..))")
    public void after(){
        System.out.println("After method executes");
    }

    @Around("execution(* com.arki.aop.demo03.UserServiceImpl.*(..))")
    public void common(ProceedingJoinPoint pj) throws Throwable{
        System.out.println("环绕前");
        System.out.println("signature:" + pj.getSignature());
        Object proceed = pj.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }
}
