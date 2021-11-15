package cn.codeartist.spring.bean.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanExample beanExample = (BeanExample) applicationContext.getBean("beanExample");
        beanExample.getBeanProvider().sayHello("码匠公众号", 2021);
    }
}
