package AOP.annotation;

import AOP.annotation.config.SpringConfiguration;
import AOP.annotation.service.MyCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnnotationAop {

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        MyCalculator bean = ac.getBean(MyCalculator.class);
        Integer a = bean.add(1, 1);
        System.out.println(a);
    }
}
