package constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("constructor.xml");
        Object person = context.getBean("person");
        Object person1 = context.getBean("person1");
        Object person2 = context.getBean("person2");
        Object person3 = context.getBean("person3");
        System.out.println("person.toString() = " + person.toString());
        System.out.println("person1.toString() = " + person1.toString());
        System.out.println("person2.toString() = " + person2.toString());
        System.out.println("person3.toString() = " + person3.toString());
    }
}
