package demo02;

import com.arki.proxy.demo02.UserService;
import com.arki.proxy.demo02.UserServiceImpl;
import com.arki.proxy.demo02.UserServiceProxy;

//测试加深代理理解
public class Test {
    @org.junit.Test
    public void test(){
        UserService userService = new UserServiceImpl();
        userService.addUser();
        userService.deleteUser();
    }

    @org.junit.Test
    public void test2(){
        UserService userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy(userService);
        userServiceProxy.addUser();
        userServiceProxy.deleteUser();
    }

}
