package cn.codeartist.spring.bean.mix;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-xml-java.xml");
        BeanExample beanExample = (BeanExample) applicationContext.getBean("beanExample");
        beanExample.getBeanProvider().sayHello("码匠公众号", 2021);
    }
}
