package cn.codeartist.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author 艾江南
 * @date 2021/12/24
 */
public class DemoAspect {

    public void doBefore(JoinPoint joinPoint) {
        System.out.println("Before advice::" + joinPoint.getSignature().getName());
    }

    public void doAfter(JoinPoint joinPoint) {
        System.out.println("After advice::" + joinPoint.getSignature().getName());
    }

    public void doAfterReturning(JoinPoint joinPoint) {
        System.out.println("After returning advice::" + joinPoint.getSignature().getName());
    }

    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around advice start::" + joinPoint.getSignature().getName());
        Object proceed = joinPoint.proceed();
        System.out.println("Around advice end::" + joinPoint.getSignature().getName());
        return proceed;
    }

    public void doAfterThrowing(JoinPoint joinPoint) {
        System.out.println("After throwing advice::" + joinPoint.getSignature().getName());
    }
}
