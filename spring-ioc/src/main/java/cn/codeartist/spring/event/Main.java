package cn.codeartist.spring.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("cn.codeartist.spring.event");
        CustomService service = applicationContext.getBean(CustomService.class);
        service.publish();
    }
}
