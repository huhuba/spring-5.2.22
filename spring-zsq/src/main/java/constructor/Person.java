package constructor;

public class Person {
    public  int  id;
    public  String  name;
    public  int  age;
    public  boolean  sex;

    public Person() {
    }

    public Person(int id) {
        this.id = id;
    }

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
