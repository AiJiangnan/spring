package cn.codeartist.spring.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
@Order(2)
@Aspect
@Component
public class SecondAspect {

    @AfterReturning("execution(* cn.codeartist.spring.aop.advice.*.*(..))")
    public void doBefore() {
        System.out.println("Second before advice");
    }

    @Around("execution(* cn.codeartist.spring.aop.advice.*.*(..))")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 方法执行前逻辑
        System.out.println("Second around advice start");
        Object retVal = joinPoint.proceed();
        System.out.println("Second around advice end");
        // 方法执行后逻辑
        return retVal;
    }
}
