package myEdit;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyEditeTest {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myEdite.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyEditConfig.class);
        Customer bean = context.getBean(Customer.class);
        bean.toString();
    }
}
