package AnnotationPostConstruct;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyAnnotationTest {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AnnoConfig.class);

    }

}
