package cn.codeartist.spring.aop.advisor;

import cn.codeartist.spring.aop.service.AopService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 艾江南
 * @date 2020/6/23
 */
public class AnnotationMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        AopService aopService = applicationContext.getBean(AopService.class);
        aopService.doService();
    }

    @Configuration
    @EnableAspectJAutoProxy
    public static class BeanConfig {

        @Bean
        public AopService aopService() {
            return new AopService();
        }

        @Bean
        public AspectJExpressionPointcutAdvisorAspect aspectjExpressionPointcutAdvisorAspect() {
            return new AspectJExpressionPointcutAdvisorAspect("execution(* cn.codeartist.spring.aop.service.*.*(..))");
        }
    }
}
