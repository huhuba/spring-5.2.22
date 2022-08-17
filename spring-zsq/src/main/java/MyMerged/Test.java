package MyMerged;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("merged.xml");
        Student student = context.getBean(Student.class);
        student.toString();
    }

}
