package com.arki.pojo;


public class UserDaoSqlserverImpl implements UserDao{
    @Override
    public void getUser() {
        System.out.println("通过sqlserver实现dao接口");
    }
}
