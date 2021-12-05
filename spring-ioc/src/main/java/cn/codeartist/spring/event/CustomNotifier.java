package cn.codeartist.spring.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

@Component
@EnableAsync
public class CustomNotifier {

    @EventListener(CustomEvent.class)
    public void listener(CustomEvent event) {
        System.out.println("Annotation listener: " + event.getName());
    }

    @Order(1)
    @EventListener
    public void listener1(CustomEvent event) {
        System.out.println("Order 1: " + event.getName());
    }

    @Order(2)
    @EventListener
    public void listener2(CustomEvent event) {
        System.out.println("Order 2: " + event.getName());
    }

    @Order(3)
    @EventListener
    public void listener3(CustomEvent event) {
        System.out.println("Order 3: " + event.getName());
    }

    @Async
    @EventListener
    public void listenerAsync(CustomEvent event) {
        System.out.println("Async: " + Thread.currentThread().getName() + " - " + event.getName());
    }
}
