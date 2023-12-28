import com.arki.pojo.Address;
import com.arki.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Address address = context.getBean("address", Address.class);
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
