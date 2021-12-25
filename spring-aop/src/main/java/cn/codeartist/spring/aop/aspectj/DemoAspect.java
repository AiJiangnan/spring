package cn.codeartist.spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
@Aspect
@Component
public class DemoAspect {

    @Pointcut("execution(* cn.codeartist.spring.aop.aspectj.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("Before advice::" + joinPoint.getSignature().getName());
    }

    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("After advice::" + joinPoint.getSignature().getName());
    }

    @AfterReturning("pointcut()")
    public void doAfterReturning(JoinPoint joinPoint) {
        System.out.println("After returning advice::" + joinPoint.getSignature().getName());
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around advice start::" + joinPoint.getSignature().getName());
        Object proceed = joinPoint.proceed();
        System.out.println("Around advice end::" + joinPoint.getSignature().getName());
        return proceed;
    }

    @AfterThrowing("pointcut()")
    public void doAfterThrowing(JoinPoint joinPoint) {
        System.out.println("After throwing advice::" + joinPoint.getSignature().getName());
    }
}
