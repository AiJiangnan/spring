package cn.codeartist.spring.bean.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        BeanExample beanExample = (BeanExample) applicationContext.getBean("beanExample");
        beanExample.hello();
        BeanExample beanExample1 = (BeanExample) applicationContext.getBean("beanExample1");
        beanExample1.hello();
        BeanExample beanExample2 = (BeanExample) applicationContext.getBean("beanExample2");
        beanExample2.hello();
        BeanExample beanExample3 = (BeanExample) applicationContext.getBean("beanExample3");
        beanExample3.run();
        BeanExample beanExample4 = (BeanExample) applicationContext.getBean("beanExample4");
        beanExample4.run();
        BeanExample beanExample5 = (BeanExample) applicationContext.getBean("beanExample5");
        beanExample5.run();
    }
}
