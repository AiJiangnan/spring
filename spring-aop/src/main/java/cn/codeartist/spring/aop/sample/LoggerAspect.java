package cn.codeartist.spring.aop.sample;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * 日志处理
 *
 * @author 艾江南
 * @date 2023/2/3
 */
@Slf4j
@Aspect
@Component
public class LoggerAspect {

    @Around("execution(* cn.codeartist.spring.aop.sample.*.*(..))")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        // 方法执行前日志
        log.info("Method args: {}", joinPoint.getArgs());
        Object proceed = joinPoint.proceed();
        // 方法执行后日志
        log.info("Method result: {}", proceed);
        return proceed;
    }
}
