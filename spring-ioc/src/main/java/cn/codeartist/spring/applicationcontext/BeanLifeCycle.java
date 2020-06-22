package cn.codeartist.spring.applicationcontext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * BeanLifeCycle
 *
 * @author 艾江南
 * @since 2019-01-01
 */
public class BeanLifeCycle implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanLifeCycle.setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanLifeCycle.setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("BeanLifeCycle.setApplicationContext");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("BeanLifeCycle.afterPropertiesSet");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanLifeCycle.postProcessBeforeInitialization beanName: " + beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanLifeCycle.postProcessAfterInitialization beanName: " + beanName);
        return bean;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("BeanLifeCycle.destroy");
    }

    private void init() {
        System.out.println("BeanLifeCycle.init");
    }

    private void destroyByClass() {
        System.out.println("BeanLifeCycle.destroyByClass");
    }
}
