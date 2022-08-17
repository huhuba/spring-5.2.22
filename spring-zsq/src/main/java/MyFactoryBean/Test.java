package MyFactoryBean;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("factoryBean.xml");
        MyFactoryBean bean1 = (MyFactoryBean) ac.getBean( "&myFactoryBean");//&****，返回FactoryBean对象本身
        MyFactoryBean bean = (MyFactoryBean) ac.getBean( "&myFactoryBean");
        User User =  (User)ac.getBean( "myFactoryBean");//不加&，返回FactoryBean对象中getObject()方法返回的实例。
        User User1 =  (User)ac.getBean( "myFactoryBean");
    }
}
