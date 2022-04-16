package cn.codeartist.spring.aop.advice;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 艾江南
 * @date 2021/12/25
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("cn.codeartist.spring.aop.advice");
        DemoService demoService = applicationContext.getBean(DemoService.class);
        demoService.doService();
//        demoService.doService("CodeArtist");
//        demoService.doServiceThrow();
        applicationContext.close();
    }
}
