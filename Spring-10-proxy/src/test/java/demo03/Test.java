package demo03;

import com.arki.proxy.demo02.UserService;
import com.arki.proxy.demo02.UserServiceImpl;
import com.arki.proxy.demo03.ProxyInvocationHandler;

public class Test {
    @org.junit.Test
    public void test(){
        UserService userService = new UserServiceImpl();
        ProxyInvocationHandler proxy = new ProxyInvocationHandler();
        proxy.setProxyTarget(userService);
        UserService userServiceProxy = (UserService) proxy.getProxy();
        userServiceProxy.addUser();
        userServiceProxy.deleteUser();
    }
}
