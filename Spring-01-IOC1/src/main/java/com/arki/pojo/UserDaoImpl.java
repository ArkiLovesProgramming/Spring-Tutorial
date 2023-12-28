package com.arki.pojo;

public class UserDaoImpl implements UserDao{

    @Override
    public void getUser() {
        System.out.println("普通的dao接口实现");
    }
}
