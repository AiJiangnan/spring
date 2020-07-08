package cn.codeartist.spring.aop.xml;

import cn.codeartist.spring.aop.service.AopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 艾江南
 * @date 2020/6/23
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        AopService aopService = applicationContext.getBean(AopService.class);
        aopService.doService();
    }
}
