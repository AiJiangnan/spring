package cn.codeartist.spring.aop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
@Aspect
@Component
public class JoinPointAspect {

    @Pointcut("execution(* cn.codeartist.spring.aop.aspectj.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("==========");
        System.out.println(Arrays.toString(joinPoint.getArgs()));
        System.out.println(joinPoint.getThis());
        System.out.println(joinPoint.getTarget());
        System.out.println(joinPoint.getSignature().getName());
        System.out.println(joinPoint);
        System.out.println("==========");
    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Around advice start::" + joinPoint.getSignature().getName());
        Object proceed = joinPoint.proceed();
        System.out.println("Around advice end::" + joinPoint.getSignature().getName());
        return proceed;
    }
}
