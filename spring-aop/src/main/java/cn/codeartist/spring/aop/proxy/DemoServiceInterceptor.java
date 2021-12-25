package cn.codeartist.spring.aop.proxy;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLIB动态代理
 *
 * @author 艾江南
 * @date 2021/12/25
 */
public class DemoServiceInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("CGLIB proxy::start");
        Object obj = methodProxy.invokeSuper(o, objects);
        System.out.println("CGLIB proxy::end");
        return obj;
    }
}
