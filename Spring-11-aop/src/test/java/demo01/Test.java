package demo01;

import com.arki.aop.demo01.UserService;
import com.arki.aop.demo01.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.addUser();
    }
}
