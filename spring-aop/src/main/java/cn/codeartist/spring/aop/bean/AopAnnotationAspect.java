package cn.codeartist.spring.aop.bean;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
@Aspect
public class AopAnnotationAspect {

    @Pointcut("execution(* cn.codeartist.spring.aop.bean.AopService.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("AopAnnotationAspect.doBefore");
    }
}
