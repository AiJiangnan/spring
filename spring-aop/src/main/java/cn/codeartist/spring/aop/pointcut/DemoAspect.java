package cn.codeartist.spring.aop.pointcut;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Pointcut详解
 *
 * @author 艾江南
 * @date 2022/4/27
 */
@Aspect
@Component
public class DemoAspect {

    @Pointcut("execution(* cn.codeartist.spring.aop.pointcut.*..*(..))")
    public void atExecution() {
    }

    @Pointcut("within(cn.codeartist.spring.aop.pointcut.DemoService)")
    public void withinInterface() {
    }

    @Pointcut("within(cn.codeartist.spring.aop.pointcut.DemoServiceImpl)")
    public void withinClass() {
    }

    @Pointcut("target(cn.codeartist.spring.aop.pointcut.DemoService)")
    public void targetInterface() {
    }

    @Pointcut("target(cn.codeartist.spring.aop.pointcut.DemoServiceImpl)")
    public void targetClass() {
    }

    @Pointcut("this(cn.codeartist.spring.aop.pointcut.DemoService)")
    public void thisInterface() {
    }

    @Pointcut("this(cn.codeartist.spring.aop.pointcut.DemoServiceImpl)")
    public void thisClass() {
    }

    // execution：匹配执行的方法，这是最基本的匹配方式

    @Before("atExecution()")
    public void doExecution() {
        System.out.println("===execution===");
    }

    // within：匹配指定类型中的方法

    @Before("withinInterface()")
    public void doWithinInterface() {
        System.out.println("===within interface===");
    }

    @Before("withinClass()")
    public void doWithinClass() {
        System.out.println("===within class===");
    }

    // target：匹配目标对象实例中的方法

    @Before("targetInterface()")
    public void doTargetInterface() {
        System.out.println("===target interface===");
    }

    @Before("targetClass()")
    public void doTargetClass() {
        System.out.println("===target class===");
    }

    // this：匹配代理对象实例中的方法

    @Before("thisInterface()")
    public void doThisInterface() {
        System.out.println("===this   interface===");
    }

    @Before("thisClass()")
    public void doThisClass() {
        System.out.println("===this   class===");
    }

    // @within：匹配指定注解的类型

    @Before("@within(cn.codeartist.spring.aop.pointcut.Demo)")
    public void doAtWithin(JoinPoint joinPoint) {
        System.out.println("===@within " + joinPoint.getTarget().getClass().getSimpleName() + "===");
    }

    // @target：匹配指定注解的目标对象实例

    @Before("@target(cn.codeartist.spring.aop.pointcut.Demo)")
    public void doAtTarget(JoinPoint joinPoint) {
        System.out.println("===@target " + joinPoint.getTarget().getClass().getSimpleName() + "===");
    }

    // @annotation：匹配指定注解的方法

    @Before("@annotation(cn.codeartist.spring.aop.pointcut.Demo)")
    public void doAtAnnotation(JoinPoint joinPoint) {
        System.out.println("===@annotation " + joinPoint.getTarget().getClass().getSimpleName() + "===");
    }

    // @args：匹配指定注解类型的方法类型

    @Before("@args(cn.codeartist.spring.aop.pointcut.Demo)")
    public void doAtArgs(JoinPoint joinPoint) {
        System.out.println("===@args " + joinPoint.getTarget().getClass().getSimpleName() + "===");
    }
}
