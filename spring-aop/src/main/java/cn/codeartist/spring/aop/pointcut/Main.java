package cn.codeartist.spring.aop.pointcut;

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
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
    }

    @Configuration
    @EnableAspectJAutoProxy
    public static class BeanConfig {

    }
}
