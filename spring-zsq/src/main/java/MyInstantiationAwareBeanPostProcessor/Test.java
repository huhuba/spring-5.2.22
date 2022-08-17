package MyInstantiationAwareBeanPostProcessor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("instantiation.xml");
        BeforeInstantiation bean = context.getBean(BeforeInstantiation.class);//返回的是代理对象
        bean.doSomeThing();//执行代理的都SomeThing()方法。
    }
}
