package com.arki.proxy.demo02;

//静态代理的加深理解
public class UserServiceProxy implements UserService{
    public UserService userService;
    public UserServiceProxy(UserService userService){
        this.userService = userService;
    }
    @Override
    public void addUser() {
        log("add");
        userService.addUser();
    }

    @Override
    public void deleteUser() {
        log("delete");
        userService.deleteUser();
    }

    @Override
    public void updateUser() {
        log("update");
        userService.updateUser();
    }

    @Override
    public void getUser() {
        log("get");
        userService.getUser();
    }

    public void log(String msg){
        System.out.println("[debug]使用了" + msg + "方法");
    }
}
