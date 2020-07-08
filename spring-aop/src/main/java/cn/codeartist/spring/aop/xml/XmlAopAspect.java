package cn.codeartist.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
public class XmlAopAspect {

    public void doAfter(JoinPoint joinPoint) {
        System.out.println("XmlAopAspect.doAfter");
    }

    public void doBefore(JoinPoint joinPoint) {
        System.out.println("XmlAopAspect.doBefore");
    }

    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("XmlAopAspect.doAround");
        return joinPoint.proceed();
    }

    public void doAfterReturning(JoinPoint joinPoint) {
        System.out.println("XmlAopAspect.doAfterReturning");
    }

    public void doAfterThrowing(JoinPoint joinPoint) {
        System.out.println("XmlAopAspect.doAfterThrowing");
    }
}
