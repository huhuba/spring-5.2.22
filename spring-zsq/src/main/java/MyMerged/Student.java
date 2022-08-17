package MyMerged;

import javax.annotation.PostConstruct;

public class Student {
    public   String  name;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct//org.springframework.context.annotation.CommonAnnotationBeanPostProcessor.postProcessBeforeInitialization
    public  void print(){
        System.out.println("Student.print");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
