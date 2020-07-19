package cn.codeartist.spring.aop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 艾江南
 * @date 2020/7/19
 */
public class ServiceProxy implements InvocationHandler {

    private Object target;

    public Object getTarget(Object object) {
        this.target = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("ServiceProxy.invoke::start");
        Object invoke = method.invoke(target, args);
        System.out.println("ServiceProxy.invoke::end");
        return invoke;
    }
}
