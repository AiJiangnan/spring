package cn.codeartist.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
public class XmlAopAspect2 {

    public void doAfter(JoinPoint joinPoint) {
        System.out.println("XmlAopAspect2.doAfter");
    }

    public void doBefore(JoinPoint joinPoint) {
        System.out.println("XmlAopAspect2.doBefore");
    }

    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("XmlAopAspect2.doAround::start");
        Object proceed = joinPoint.proceed();
        System.out.println("XmlAopAspect2.doAround::end");
        return proceed;
    }

    public void doAfterReturning(JoinPoint joinPoint) {
        System.out.println("XmlAopAspect2.doAfterReturning");
    }

    public void doAfterThrowing(JoinPoint joinPoint) {
        System.out.println("XmlAopAspect2.doAfterThrowing");
    }
}
