package cn.codeartist.spring.aop.aopapi;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Pointcut;
import org.springframework.aop.support.AbstractPointcutAdvisor;

/**
 * Advisor
 *
 * @author 艾江南
 * @date 2022/11/14
 */
public class DemoPointcutAdvisor extends AbstractPointcutAdvisor {

    private Pointcut pointcut;
    private Advice advice;

    @Override
    public Pointcut getPointcut() {
        return this.pointcut;
    }

    @Override
    public Advice getAdvice() {
        return this.advice;
    }

    public void setPointcut(Pointcut pointcut) {
        this.pointcut = pointcut;
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }
}
