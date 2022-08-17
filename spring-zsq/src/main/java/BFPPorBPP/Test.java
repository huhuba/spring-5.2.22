package BFPPorBPP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new MyClassPathXmlApplicationContext("BFPPorBPP.xml");
        Teacher teacher = context.getBean(Teacher.class);
        System.out.println(teacher.toString());

    }
}
