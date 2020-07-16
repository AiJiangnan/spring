package cn.codeartist.spring.aop.aspectj.advice;

import cn.codeartist.spring.aop.service.AopService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
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
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        AopService aopService = applicationContext.getBean(AopService.class);
        String result = aopService.doService("hello");
        System.out.println("Main.main::" + result);
        aopService.doServiceException();
    }

    @Configuration
    @EnableAspectJAutoProxy
    public static class BeanConfig {

        @Bean
        public AopService aopService() {
            return new AopService();
        }

        @Bean
        public AdviceDemoAspect adviceDemoAspect() {
            return new AdviceDemoAspect();
        }
    }
}
