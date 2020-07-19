package cn.codeartist.spring.aop.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 艾江南
 * @date 2020/7/19
 */
public class ServiceInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("ServiceInterceptor.intercept::start");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("ServiceInterceptor.intercept::end");
        return obj;
    }
}
