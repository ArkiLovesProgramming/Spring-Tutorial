package com.arki.proxy.demo03;

import org.aopalliance.intercept.Invocation;
import org.springframework.aop.ProxyMethodInvocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //设置需要代理的接口
    private Object target;
    //注入代理对象
    public void setProxyTarget(Object target) {
        this.target = target;
    }


//    public static Object newProxyInstance(ClassLoader loader,
//                                          Class<?>[] interfaces,
//                                          InvocationHandler h) {
    //获取代理类对象（可以用这个调用方法，方法会自动执行invoke而不是真实对象本身
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result = method.invoke(target, args);
        return result;
    }

    public void log(String msg){
        System.out.println("[debug]执行了" + msg + "方法");
    }
}
