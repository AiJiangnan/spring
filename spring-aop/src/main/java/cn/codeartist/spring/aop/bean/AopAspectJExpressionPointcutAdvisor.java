package cn.codeartist.spring.aop.bean;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;

/**
 * @author 艾江南
 * @date 2020/7/7
 */
public class AopAspectJExpressionPointcutAdvisor extends AspectJExpressionPointcutAdvisor {

    public AopAspectJExpressionPointcutAdvisor(String expression) {
        super.setExpression(expression);
        super.setAdvice((MethodBeforeAdvice) (method, args, target) -> {
            System.out.println(method);
        });
    }
}
