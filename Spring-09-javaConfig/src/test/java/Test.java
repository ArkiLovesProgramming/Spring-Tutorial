import com.arki.config.SpringConfig;
import com.arki.pojo.Address;
import com.arki.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        User user = context.getBean("getUser", User.class);
        Address address = context.getBean("address", Address.class);
        System.out.println(user);
    }
}
