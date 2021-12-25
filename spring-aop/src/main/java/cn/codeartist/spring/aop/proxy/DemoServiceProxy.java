package cn.codeartist.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理
 *
 * @author 艾江南
 * @date 2021/12/25
 */
public class DemoServiceProxy implements InvocationHandler {

    private Object target;

    public Object getTarget(Object object) {
        this.target = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("JDK proxy::start");
        Object invoke = method.invoke(target, args);
        System.out.println("JDK proxy::end");
        return invoke;
    }
}
