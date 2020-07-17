package cn.codeartist.spring.aop.advisor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * @author 艾江南
 * @date 2020/7/7
 */
public class AspectJExpressionPointcutAdvisorAspect extends AspectJExpressionPointcutAdvisor {

    public AspectJExpressionPointcutAdvisorAspect(String expression) {
        super.setExpression(expression);
        super.setAdvice(new AopBeforeAdvice());
//        super.setAdvice(new AopAroundAdvice());
//        super.setAdvice(new AopAfterReturningAdvice());
//        super.setAdvice(new AopAfterThrowingAdvice());
    }

    public static class AopBeforeAdvice implements MethodBeforeAdvice {

        @Override
        public void before(Method method, Object[] args, Object target) throws Throwable {
            System.out.println("AopBeforeAdvice.before");
        }
    }

    public static class AopAroundAdvice implements MethodInterceptor {

        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {
            System.out.println("AopAroundAdvice.invoke");
            return invocation.proceed();
        }
    }

    public static class AopAfterReturningAdvice implements AfterReturningAdvice {

        @Override
        public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
            System.out.println("AopAfterReturningAdvice.afterReturning");
        }
    }

    public static class AopAfterThrowingAdvice implements ThrowsAdvice {

        public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
            System.out.println("AopAfterThrowingAdvice.afterThrowing");
        }
    }
}
