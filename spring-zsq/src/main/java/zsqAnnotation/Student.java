package zsqAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Student extends Person {

    public void printStudent() {
        System.out.println("Student=Student");
        printPerson();
        super.printPerson();
    }

}
