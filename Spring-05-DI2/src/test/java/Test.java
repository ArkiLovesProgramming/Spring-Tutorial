import com.arki.pojo.Student;
import com.arki.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }

    //测试用p标签注入
    @org.junit.Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans.xml");
        //如果加了类标识，就可以不用强转
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    //测试用c标签注入
    @org.junit.Test
    public void test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("UserBeans2.xml");
        //如果加了类标识，就可以不用强转
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }
}
