import myEdit.Customer;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zsqAnnotation.MyClassPathApplicationContext;
import zsqAnnotation.Person;

public class MyTest {
    public static void main(String[] args) {
        MyClassPathApplicationContext context = new MyClassPathApplicationContext("myEdite.xml");
        Customer person = context.getBean(Customer.class);
        System.out.println(person.toString());
    }
}
