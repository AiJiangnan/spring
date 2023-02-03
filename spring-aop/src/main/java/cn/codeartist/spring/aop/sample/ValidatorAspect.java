package cn.codeartist.spring.aop.sample;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 参数校验
 *
 * @author 艾江南
 * @date 2023/2/3
 */
@Slf4j
@Aspect
@Component
public class ValidatorAspect {

    @Before("execution(* cn.codeartist.spring.aop.sample.*.*(..))")
    public void doBefore(JoinPoint joinPoint) {
        // 方法执行前校验参数
        // Object[] args = joinPoint.getArgs();
    }
}
