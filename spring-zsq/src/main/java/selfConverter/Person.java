package selfConverter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Person {
    @Bean
    @Value("1234-1234-1234")
    public  Student   getStudent(){
        return  new Student();
    }
}
