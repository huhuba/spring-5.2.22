package MyApplicationEventMuticaster;

import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

//method two
@Component(value = "applicationEventMulticaster")
public class MyApplicationEventMulticaster extends SimpleApplicationEventMulticaster {
    //method one
/*    @Bean(value = "applicationEventMulticaster")
    public SimpleApplicationEventMulticaster getMuticaster() {
        SimpleApplicationEventMulticaster mu = new SimpleApplicationEventMulticaster();
        mu.setTaskExecutor(Executors.newFixedThreadPool(5));
        return mu;
    }*/
    public MyApplicationEventMulticaster() {
        setTaskExecutor(Executors.newFixedThreadPool(5));
    }
}
