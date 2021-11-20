package cn.codeartist.spring.bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.util.StringValueResolver;

public abstract class BeanAware implements
        BeanNameAware, BeanClassLoaderAware, BeanFactoryAware,
        EnvironmentAware, EmbeddedValueResolverAware, ResourceLoaderAware,
        ApplicationEventPublisherAware, MessageSourceAware, ApplicationContextAware {

    @Override
    public void setBeanName(String name) {

    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

    }

    @Override
    public void setEmbeddedValueResolver(StringValueResolver resolver) {

    }

    @Override
    public void setEnvironment(Environment environment) {

    }

    @Override
    public void setMessageSource(MessageSource messageSource) {

    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {

    }
}
