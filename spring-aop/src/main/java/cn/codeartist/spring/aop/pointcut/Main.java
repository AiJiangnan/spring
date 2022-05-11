package cn.codeartist.spring.aop.pointcut;

import cn.codeartist.spring.aop.pointcut.service.DemoSubService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/16
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("cn.codeartist.spring.aop.pointcut");
        DemoService bean = applicationContext.getBean(DemoService.class);
        Example example = new Example();
        example.setName("CodeArtist");
        bean.doService(example);
        DemoSubService bean2 = applicationContext.getBean(DemoSubService.class);
        bean2.doService(example);
        applicationContext.close();
    }

    @Configuration
    @EnableAspectJAutoProxy
    public static class BeanConfig {

    }
}
