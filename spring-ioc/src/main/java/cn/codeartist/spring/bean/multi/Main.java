package cn.codeartist.spring.bean.multi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceTest serviceTest = applicationContext.getBean(ServiceTest.class);
        serviceTest.run();
    }
}
