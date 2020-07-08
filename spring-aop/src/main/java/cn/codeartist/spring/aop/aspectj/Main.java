package cn.codeartist.spring.aop.aspectj;

import cn.codeartist.spring.aop.service.AopService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 艾江南
 * @date 2020/6/23
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop-aspectj.xml");
        AopService aopService = applicationContext.getBean(AopService.class);
        aopService.doService();
    }
}
