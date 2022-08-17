package methodOverrides.lookup;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("methodOverride.xml");
/*
        Banana banana = context.getBean(Banana.class);
        Banana banana1 = context.getBean(Banana.class);
        System.out.println("banana = " + banana.toString());
        System.out.println("banana1 = " + banana1.toString());*/

        FruitPlate fruitPlate1 = (FruitPlate)context.getBean("fruitplate1");
        FruitPlate fruitPlate2 = (FruitPlate)context.getBean("fruitplate2");
        System.out.println("fruitPlate1.getFruit() = " + fruitPlate1.getFruit());
        System.out.println("fruitPlate2.getFruit() = " + fruitPlate2.getFruit());
    }
}
