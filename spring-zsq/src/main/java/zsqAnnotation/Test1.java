package zsqAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("test.xml");
        Person person = context.getBean(Person.class);

    }
}

/*
@Configuration
@ConditionalOnClass(value = {Client.class})
public class MyAutoConfig {
    public MyAutoConfig() {
        System.out.println("constructor MyAutoConfig");
    }
}
*/
