package Supply;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("supply.xml");
        User bean = context.getBean(User.class);//
        System.out.println("bean.toString() = " + bean.toString());
    }
}
