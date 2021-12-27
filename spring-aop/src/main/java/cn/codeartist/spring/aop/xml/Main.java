package cn.codeartist.spring.aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 艾江南
 * @date 2020/6/23
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        DemoService aopService = applicationContext.getBean(DemoService.class);
        aopService.doService();
        aopService.doException();
    }
}
