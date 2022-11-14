package cn.codeartist.spring.aop.aopapi.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * 环绕通知
 *
 * @author 艾江南
 * @date 2022/11/14
 */
public class AroundAdvice implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("AroundAdvice.invoke");
        return invocation.proceed();
    }
}
