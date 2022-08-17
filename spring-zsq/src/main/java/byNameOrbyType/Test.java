package byNameOrbyType;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("byNameOrbyType.xml");
        Person person = context.getBean(Person.class);
        System.out.println("person.getAddress().toString() = " + person.getAddress().toString());;
        context.close();
    }
}
