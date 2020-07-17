package cn.codeartist.spring.aop.pointcut;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/16
 */
@Aspect
public class AdviceDemoAspect {

    @Pointcut("within(cn.codeartist.spring.aop.service.AopService)")
    public void withinClass() {
    }

    @Pointcut("within(cn.codeartist.spring.aop.service.AopServiceApi)")
    public void withinInterface() {
    }

    @Pointcut("within(cn.codeartist.spring.aop.service.AopServiceApiImpl)")
    public void withinClassImpl() {
    }

    @Pointcut("this(cn.codeartist.spring.aop.service.AopService)")
    public void thisClass() {
    }

    @Pointcut("this(cn.codeartist.spring.aop.service.AopServiceApi)")
    public void thisInterface() {
    }

    @Pointcut("this(cn.codeartist.spring.aop.service.AopServiceApiImpl)")
    public void thisClassImpl() {
    }

    @Pointcut("target(cn.codeartist.spring.aop.service.AopService)")
    public void targetClass() {
    }

    @Pointcut("target(cn.codeartist.spring.aop.service.AopServiceApi)")
    public void targetInterface() {
    }

    @Pointcut("target(cn.codeartist.spring.aop.service.AopServiceApiImpl)")
    public void targetClassImpl() {
    }

    @Pointcut("@within(cn.codeartist.spring.aop.pointcut.Demo)")
    public void atWithin() {
    }

    @Pointcut("@target(cn.codeartist.spring.aop.pointcut.Demo)")
    public void atTarget() {
    }

    @Pointcut("@annotation(cn.codeartist.spring.aop.pointcut.Demo)")
    public void atMethod() {
    }

//    // within
//
//    @Before("withinClass()")
//    public void doWithinClass() {
//        // RUN
//        System.out.println("AdviceDemoAspect.doWithinClass");
//    }
//
//    @Before("withinInterface()")
//    public void doWithinInterface() {
//        System.out.println("AdviceDemoAspect.doWithinInterface");
//    }
//
//    @Before("withinClassImpl()")
//    public void doWithinClassImpl() {
//        // RUN
//        System.out.println("AdviceDemoAspect.doWithinClassImpl");
//    }
//
//    // this
//
//    @Before("thisClass()")
//    public void doThisClass() {
//        // RUN
//        System.out.println("AdviceDemoAspect.doThisClass");
//    }
//
//    @Before("thisInterface()")
//    public void doThisInterface() {
//        // RUN
//        System.out.println("AdviceDemoAspect.doThisInterface");
//    }
//
//    @Before("thisClassImpl()")
//    public void doThisClassImpl() {
//        // CGLib RUN
//        System.out.println("AdviceDemoAspect.doThisClassImpl");
//    }
//
//    // target
//
//    @Before("targetClass()")
//    public void doTargetClass() {
//        // RUN
//        System.out.println("AdviceDemoAspect.doTargetClass");
//    }
//
//    @Before("targetInterface()")
//    public void doTargetInterface() {
//        // RUN
//        System.out.println("AdviceDemoAspect.doTargetInterface");
//    }
//
//    @Before("targetClassImpl()")
//    public void doTargetClassImpl() {
//        // RUN
//        System.out.println("AdviceDemoAspect.doTargetClassImpl");
//    }
//
//    // args
//
//    @Before("withinClass() && args(str)")
//    public void doArgsClass(String str) {
//        System.out.println("AdviceDemoAspect.doArgsClass::" + str);
//    }

    // @within

    @Before("atWithin()")
    public void doAtWithin() {
        // RUN Class ClassImpl BaseClassNoOverride
        System.out.println("AdviceDemoAspect.doAtWithin");
    }

    // @target

    @Before("atTarget()")
    public void doAtTarget() {
        // RUN Class ClassImpl
        System.out.println("AdviceDemoAspect.doAtTarget");
    }

    // @annotation

    @Before("atMethod()")
    public void doAtMethod() {
        // RUN Class ClassImpl
        System.out.println("AdviceDemoAspect.doAtMethod");
    }
}
