package cn.codeartist.spring.aop.aspectj.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/16
 */
@Aspect
public class AdviceDemoAspect {

    @Pointcut("execution(* cn.codeartist.spring.aop.service.AopService.doService(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore() {
        System.out.println("AdviceDemoAspect.doBefore");
    }

    @AfterReturning(pointcut = "pointcut()", returning = "retVal")
    public void doAfterReturning(Object retVal) {
        System.out.println("AdviceDemoAspect.doAfterReturning::" + retVal);
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AdviceDemoAspect.doAround::start");
        Object proceed = joinPoint.proceed();
        System.out.println("AdviceDemoAspect.doAround::end");
        return proceed;
    }

    @After("pointcut()")
    public void doAfter(JoinPoint joinPoint) {
        System.out.println("AdviceDemoAspect.doAfter");
    }

    @AfterThrowing(pointcut = "execution(* cn.codeartist.spring.aop.service.AopService.doServiceException(..))", throwing = "ex")
    public void doAfterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("AdviceDemoAspect.doAfterThrowing::" + ex.getMessage());
    }
}
