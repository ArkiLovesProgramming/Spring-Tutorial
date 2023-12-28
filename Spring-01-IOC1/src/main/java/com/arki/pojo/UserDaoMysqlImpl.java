package com.arki.pojo;

public class UserDaoMysqlImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("通过mysql实现dao接口");
    }
}
