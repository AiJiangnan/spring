package cn.codeartist.spring.aop.aspectj;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

    @Bean
    public AspectJExpressionPointcutAdvisor aspectJExpressionPointcutAdvisor() {
        AspectJExpressionPointcutAdvisor advisor = new AspectJExpressionPointcutAdvisor();
        advisor.setExpression("execution(* cn.codeartist.spring.aop.aspectj.*.*(..))");
        advisor.setAdvice((MethodBeforeAdvice) (method, args, target) -> {
            // do something
        });
        return advisor;
    }
}
