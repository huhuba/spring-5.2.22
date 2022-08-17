package AnnotationPostConstruct;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class MyPostConstructAndDestroy {

    @PostConstruct
    public  void testPostConstruct(){
        System.out.println("开始调用@PostConstruct修饰的方法。。。。。。。。");
    }

    @PreDestroy
    public void  preDestroy(){
        System.out.println("开始销毁前的处理，调用@PreDestroy修饰的方法。。。。。。。。。。。。。。。。。。。。。。。。");
    }
}
