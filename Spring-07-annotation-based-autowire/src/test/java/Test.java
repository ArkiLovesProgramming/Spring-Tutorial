import com.arki.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Person person = context.getBean("person", Person.class);
        person.getDog().cry();
        person.getCat().cry();
    }
}
