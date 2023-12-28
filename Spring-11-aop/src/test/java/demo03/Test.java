package demo03;

import com.arki.aop.demo03.UserService;
import com.arki.aop.demo03.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
        UserService userService = (UserService) context.getBean("userServiceImpl");
        userService.addUser();
    }
}
