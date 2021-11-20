package cn.codeartist.spring.bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanInstanceProcessor implements InstantiationAwareBeanPostProcessor {

    public BeanInstanceProcessor() {
        System.out.println("BeanInstanceProcessor - 优先初始化");
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        System.out.println("BeanInstanceProcessor - " + beanName + "即将实例化");
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        System.out.println("BeanInstanceProcessor - " + beanName + "实例化完成");
        return true;
    }
}
