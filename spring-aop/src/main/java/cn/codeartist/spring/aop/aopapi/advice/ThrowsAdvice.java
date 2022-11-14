package cn.codeartist.spring.aop.aopapi.advice;

import java.lang.reflect.Method;

/**
 * 异常通知
 *
 * @author 艾江南
 * @date 2022/11/14
 */
public class ThrowsAdvice implements org.springframework.aop.ThrowsAdvice {

    public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
        System.out.println("ThrowsAdvice.afterThrowing");
    }
}
