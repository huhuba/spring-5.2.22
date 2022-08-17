package MyApplicationEventMuticaster;

import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class MyApplicationListener2 {
    @EventListener
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("event2 = " + event);
    }
    @EventListener
    public void onApplicationEvent2(ContextStartedEvent event) {
        System.out.println("event3 = " + event);
    }
}
