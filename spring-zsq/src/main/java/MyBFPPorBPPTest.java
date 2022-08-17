import BFPPorBPP.Teacher;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class MyBFPPorBPPTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("BFPPorBPP.xml");
        Teacher teacher = context.getBean(Teacher.class);
/*
        System.out.println();//sout
        System.out.println("MyBFPPorBPPTest.main");//soutm
        System.out.println("args = " + Arrays.deepToString(args));//soutp
*/
        System.out.println("teacher = " + teacher.toString());//soutv
    }
}
