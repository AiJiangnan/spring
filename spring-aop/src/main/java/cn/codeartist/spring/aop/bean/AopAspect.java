package cn.codeartist.spring.aop.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
public class AopAspect {

    public void doAfter(JoinPoint joinPoint) {
        System.out.println("AopAspect.doAfter");
    }

    public void doBefore(JoinPoint joinPoint) {
        System.out.println("AopAspect.doBefore");
    }

    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("AopAspect.doAround");
        return joinPoint.proceed();
    }

    public void doAfterReturning(JoinPoint joinPoint) {
        System.out.println("AopAspect.doAfterReturning");
    }

    public void doAfterThrowing(JoinPoint joinPoint) {
        System.out.println("AopAspect.doAfterThrowing");
    }
}
