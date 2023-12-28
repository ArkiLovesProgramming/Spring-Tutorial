package com.arki.aop.demo03;

import org.springframework.stereotype.Component;


@Component
public class UserServiceImpl implements UserService {
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
