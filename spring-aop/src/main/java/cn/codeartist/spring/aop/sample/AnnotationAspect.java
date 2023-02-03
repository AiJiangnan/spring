package cn.codeartist.spring.aop.sample;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 自定义注解
 *
 * @author 艾江南
 * @date 2023/2/3
 */
@Aspect
@Component
public class AnnotationAspect {

    @Around("@annotation(demoAnno)")
    public Object doAround(ProceedingJoinPoint joinPoint, DemoAnno demoAnno) throws Throwable {
        // 自定义逻辑
        return joinPoint.proceed();
    }
}
