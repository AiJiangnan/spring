package cn.codeartist.spring.aop.pointcut;

import cn.codeartist.spring.aop.service.AopServiceApi;
import cn.codeartist.spring.aop.service.AopServiceApiImpl;
import cn.codeartist.spring.aop.service.SubAopService;
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
        SubAopService aopService = applicationContext.getBean(SubAopService.class);
        aopService.doService();
//        String str = aopService.doService("ajn");
//        System.out.println(str);
        AopServiceApi aopServiceApi = applicationContext.getBean(AopServiceApi.class);
        aopServiceApi.doService();
    }

    @Configuration
    @EnableAspectJAutoProxy
    public static class BeanConfig {

        @Bean
        public SubAopService aopService() {
            return new SubAopService();
        }

        @Bean
        public AopServiceApi aopServiceApi() {
            return new AopServiceApiImpl();
        }

        @Bean
        public AdviceDemoAspect adviceDemoAspect() {
            return new AdviceDemoAspect();
        }
    }
}
