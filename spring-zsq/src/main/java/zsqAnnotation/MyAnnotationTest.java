package zsqAnnotation;

import config.Config;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAnnotationTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
/*        MyPropertySource propertySource = context.getBean(MyPropertySource.class);
        System.out.println("propertySource = " + propertySource.toString());*/
        Person person = (Person)context.getBean("person");
        System.out.println("person = " + person.toString());
    }

}
