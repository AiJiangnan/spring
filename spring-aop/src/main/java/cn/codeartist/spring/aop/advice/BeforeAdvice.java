package cn.codeartist.spring.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * 自定义前置通知
 *
 * @author 艾江南
 * @date 2020/7/14
 */
public class BeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] args, Object target) {
        System.out.println("Advisor before advice.");
    }
}
