package demo02;

import com.arki.aop.demo02.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
        UserService userService = context.getBean("userServiceImpl", UserService.class);
        userService.addUser();
        userService.deleteUser();
    }
}
