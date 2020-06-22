package cn.codeartist.spring.config;

import cn.codeartist.spring.config.proxy.FacadeProxy;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * @author 艾江南
 * @date 2019/3/19
 */
public class MyProxyFactory<T> implements FactoryBean<T> {

    private Class<T> interfaceClass;

    public void setInterfaceClass(Class<T> interfaceClass) {
        this.interfaceClass = interfaceClass;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T getObject() {
        return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass}, new FacadeProxy());
    }

    @Override
    public Class<?> getObjectType() {
        return interfaceClass;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
