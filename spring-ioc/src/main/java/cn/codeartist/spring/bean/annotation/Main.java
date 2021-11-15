package cn.codeartist.spring.bean.annotation;

import cn.codeartist.spring.bean.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-annotation.xml");
        BeanExample beanExample = (BeanExample) applicationContext.getBean("beanExample");
        beanExample.getBeanProvider().sayHello("码匠公众号", 2021);

        ApplicationContext annotationApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanExample beanExample1 = (BeanExample) annotationApplicationContext.getBean("beanExample");
    }
}
