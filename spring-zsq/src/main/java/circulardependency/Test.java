package circulardependency;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("circulardependency.xml");
		B b = context.getBean(B.class);
		b.getA().printA();
		context.close();

    }
}
