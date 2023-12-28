package com.arki.proxy.demo02;


//模拟真实业务，来加深对代理模式的理解
//业务层接口
public interface UserService {
    public void addUser();
    public void deleteUser();
    public void updateUser();
    public void getUser();
}
