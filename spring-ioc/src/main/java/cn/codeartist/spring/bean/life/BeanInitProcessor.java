package cn.codeartist.spring.bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanInitProcessor implements BeanPostProcessor {

    public BeanInitProcessor() {
        System.out.println("BeanInitProcessor - 优先初始化");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanInitProcessor - " + beanName + "即将初始化");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("BeanInitProcessor - " + beanName + "初始化完成");
        return bean;
    }
}
