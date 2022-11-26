package cn.codeartist.spring.aop.aopapi;

import cn.codeartist.spring.aop.aopapi.advice.DemoAroundAdvice;
import org.springframework.aop.Advisor;
import org.springframework.aop.aspectj.AspectJExpressionPointcut;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Spring AOP API
 *
 * @author 艾江南
 * @date 2022/11/14
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("cn.codeartist.spring.aop.aopapi");

        DemoService bean = applicationContext.getBean(DemoService.class);
        bean.doService();

        applicationContext.close();
    }

    @Configuration
    @EnableAspectJAutoProxy
    public static class AopApiConfig {

        @Bean
        public Advisor demoPointcutAdvisor() {
            DemoPointcutAdvisor advisor = new DemoPointcutAdvisor();

            AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
            pointcut.setExpression("execution(* cn.codeartist.spring.aop.aopapi.*.*(..))");
            advisor.setPointcut(pointcut);

            // advisor.setAdvice(new BeforeAdvice());
            advisor.setAdvice(new DemoAroundAdvice());
            // advisor.setAdvice(new AfterReturningAdvice());
            // advisor.setAdvice(new ThrowsAdvice());

            return advisor;
        }
    }
}
