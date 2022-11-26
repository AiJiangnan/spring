package cn.codeartist.spring.aop.aopapi.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * 后置通知
 *
 * @author 艾江南
 * @date 2022/11/14
 */
public class DemoAfterReturningAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) {
        System.out.println("AfterReturningAdvice.afterReturning");
    }
}
