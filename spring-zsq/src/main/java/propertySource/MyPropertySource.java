package propertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:propertySource.properties"})
public class MyPropertySource {

    @Value("${name}")
    private String name;
    @Value("${age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyPropertySource{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
