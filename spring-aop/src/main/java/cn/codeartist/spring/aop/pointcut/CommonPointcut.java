package cn.codeartist.spring.aop.pointcut;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Pointcut
 *
 * @author 艾江南
 * @date 2022/5/11
 */
public class CommonPointcut {

    @Pointcut("execution(* cn.codeartist.spring.aop.pointcut.*..*(..))")
    public void pointcut() {
    }
}
