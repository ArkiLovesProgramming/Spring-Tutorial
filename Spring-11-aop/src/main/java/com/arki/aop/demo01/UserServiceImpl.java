package com.arki.aop.demo01;


//方式一采用Spring接口实现aop
public class UserServiceImpl implements UserService{
    @Override
    public void addUser() {
        System.out.println("A user added!");
    }

    @Override
    public void deleteUser() {
        System.out.println("A user deleted!");
    }

    @Override
    public void updateUser() {
        System.out.println("A user updated!");
    }

    @Override
    public void getUser() {
        System.out.println("A user got!!");
    }
}
