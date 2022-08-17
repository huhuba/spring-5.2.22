package zsqAnnotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("zsqAnnotation")
public class MyComponentScan {

    @ComponentScan("zsqAnnotation")
    @Configuration
    class   InnerClass{

    }
}
