package cn.codeartist.spring.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
@Order(1)
@Aspect
@Component
public class FirstAspect {

    @AfterReturning("execution(* cn.codeartist.spring.aop.advice.*.*(..))")
    public void doBefore() {
        System.out.println("First before advice");
    }

    @Around("execution(* cn.codeartist.spring.aop.advice.*.*(..))")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 方法执行前逻辑
        System.out.println("First around advice start");
        Object retVal = joinPoint.proceed();
        System.out.println("First around advice end");
        // 方法执行后逻辑
        return retVal;
    }
}
