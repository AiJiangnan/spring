package cn.codeartist.spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
@Aspect
public class AnnotationAopAspect {

    @Pointcut("execution(* cn.codeartist.spring.aop.service.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("AnnotationAopAspect.doBefore");
    }

    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("AnnotationAopAspect.doAfter");
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AnnotationAopAspect.doAround");
        return joinPoint.proceed();
    }

    @AfterReturning("pointcut()")
    public void doAfterReturning(JoinPoint joinPoint) {
        System.out.println("AnnotationAopAspect.doAfterReturning");
    }

    @AfterThrowing("pointcut()")
    public void doAfterThrowing(JoinPoint joinPoint) {
        System.out.println("AnnotationAopAspect.doAfterThrowing");
    }
}
