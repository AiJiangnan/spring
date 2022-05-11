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
    private void atExecution() {
    }

    // execution：匹配执行的方法，这是最基本的匹配方式

    @Before("atExecution()")
    public void doExecution() {
        System.out.println("===execution===");
    }

    // within：匹配指定类型中的方法

    @Before("within(cn.codeartist.spring.aop.pointcut.DemoService)")
    public void doWithinInterface() {
        System.out.println("===within interface===");
    }

    @Before("within(cn.codeartist.spring.aop.pointcut.DemoServiceImpl)")
    public void doWithinClass() {
        System.out.println("===within class===");
    }

    // target：匹配目标对象实例中的方法

    @Before("target(cn.codeartist.spring.aop.pointcut.DemoService)")
    public void doTargetInterface() {
        System.out.println("===target interface===");
    }

    @Before("target(cn.codeartist.spring.aop.pointcut.DemoServiceImpl)")
    public void doTargetClass() {
        System.out.println("===target class===");
    }

    // this：匹配代理对象实例中的方法

    @Before("this(cn.codeartist.spring.aop.pointcut.DemoService)")
    public void doThisInterface() {
        System.out.println("===this   interface===");
    }

    @Before("this(cn.codeartist.spring.aop.pointcut.DemoServiceImpl)")
    public void doThisClass() {
        System.out.println("===this   class===");
    }

    // bean：匹配Bean名称

    @Before("bean(demoServiceImpl)")
    public void doBeanName() {
        System.out.println("===bean name===");
    }

    // @within：匹配指定注解的类型

    @Before("@within(cn.codeartist.spring.aop.pointcut.Demo)")
    public void doAtWithin(JoinPoint joinPoint) {
        System.out.println("===@within " + getSimpleName(joinPoint) + "===");
    }

    // @target：匹配指定注解的目标对象实例
    @Before("@target(cn.codeartist.spring.aop.pointcut.Demo)")
    public void doAtTarget(JoinPoint joinPoint) {
        System.out.println("===@target " + getSimpleName(joinPoint) + "===");
    }


    // @annotation：匹配指定注解的方法
    @Before("@annotation(cn.codeartist.spring.aop.pointcut.Demo)")
    public void doAtAnnotation(JoinPoint joinPoint) {
        System.out.println("===@annotation " + getSimpleName(joinPoint) + "===");
    }


    // @args：匹配指定注解类型的方法类型
    @Before("@args(cn.codeartist.spring.aop.pointcut.Demo)")
    public void doAtArgs(JoinPoint joinPoint) {
        System.out.println("===@args " + getSimpleName(joinPoint) + "===");
    }

    // Common Pointcut

    @Before("cn.codeartist.spring.aop.pointcut.CommonPointcut.pointcut()")
    public void commonPointcut() {
        System.out.println("===Common Pointcut===");
    }

    private String getSimpleName(JoinPoint joinPoint) {
        return joinPoint.getTarget().getClass().getSimpleName();
    }
}
