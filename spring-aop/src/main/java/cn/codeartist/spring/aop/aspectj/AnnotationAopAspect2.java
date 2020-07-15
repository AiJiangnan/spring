package cn.codeartist.spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
@Aspect
public class AnnotationAopAspect2 {

    @Pointcut("execution(* cn.codeartist.spring.aop.service.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("AnnotationAopAspect2.doBefore");
    }

    @AfterReturning("pointcut()")
    public void doAfterReturning(JoinPoint joinPoint) {
        System.out.println("AnnotationAopAspect2.doAfterReturning");
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AnnotationAopAspect2.doAround::start");
        Object proceed = joinPoint.proceed();
        System.out.println("AnnotationAopAspect2.doAround::end");
        return proceed;
    }

    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("AnnotationAopAspect2.doAfter");
    }

    @AfterThrowing("pointcut()")
    public void doAfterThrowing(JoinPoint joinPoint) {
        System.out.println("AnnotationAopAspect2.doAfterThrowing");
    }
}
