package cn.codeartist.spring.aop.aspectj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 艾江南
 * @date 2021/12/25
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("cn.codeartist.spring.aop.aspectj");
        DemoService demoService = applicationContext.getBean(DemoService.class);
        try {
            demoService.doService();
            demoService.doException();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
