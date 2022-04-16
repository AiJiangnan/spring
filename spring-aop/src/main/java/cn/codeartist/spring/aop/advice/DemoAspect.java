package cn.codeartist.spring.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
@Aspect
//@Component
public class DemoAspect {

    @Pointcut("execution(* cn.codeartist.spring.aop.advice.*.*(..))")
    public void pointcut() {
    }

    // Before

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("Before advice::" + joinPoint.getSignature().getName());
    }

    @Before("pointcut() && args(name,..)")
    public void doBefore(String name) {
        System.out.println("Before advice with param ::" + name);
    }

    // AfterReturning

    @AfterReturning("execution(* cn.codeartist.spring.aop.advice.*.*(..))")
    public void doAfterReturning() {
        System.out.println("After returning advice");
    }

    @AfterReturning(pointcut = "pointcut()", returning = "retVal")
    public void doAfterReturning(Object retVal) {
        System.out.println("After returning advice :: " + retVal);
    }

    @AfterReturning(pointcut = "pointcut()", returning = "retVal")
    public void doAfterReturning(Integer retVal) {
        System.out.println("After returning advice with Integer returning :: " + retVal);
    }

    // AfterThrowing

    @AfterThrowing("pointcut()")
    public void doAfterThrowing() {
        System.out.println("After throwing advice");
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "ex")
    public void doAfterThrowing(Throwable ex) {
        System.out.println("After throwing advice :: " + ex.getMessage());
    }

    @AfterThrowing(pointcut = "pointcut()", throwing = "ex")
    public void doAfterThrowing(NullPointerException ex) {
        System.out.println("After throwing advice with NullPointerException :: " + ex.getMessage());
    }

    // After

    @After("execution(* cn.codeartist.spring.aop.advice.*.*(..))")
    public void doAfter() {
        System.out.println("After advice");
    }

    // @Around

    @Around("execution(* cn.codeartist.spring.aop.advice.*.*(..))")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 方法执行前逻辑
        System.out.println("Around advice start");
        Object retVal = joinPoint.proceed();
        System.out.println("Around advice end");
        // 方法执行后逻辑
        return retVal;
    }
}
