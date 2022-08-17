package propertySource;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(PropertySourceConfig.class);
        System.out.println(con.getBean(MyPropertySource.class).toString());
    }
}
