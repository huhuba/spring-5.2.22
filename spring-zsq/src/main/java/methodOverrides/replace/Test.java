package methodOverrides.replace;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("methodOverride.xml");
        OriginalDog originalDog = context.getBean(OriginalDog.class);
        originalDog.sayHello();
    }
}
