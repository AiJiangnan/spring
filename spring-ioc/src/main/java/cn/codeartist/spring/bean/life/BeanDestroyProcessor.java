package cn.codeartist.spring.bean.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

@Component
public class BeanDestroyProcessor implements DestructionAwareBeanPostProcessor {

    public BeanDestroyProcessor() {
        System.out.println("BeanDestroyProcessor - 优先初始化");
    }

    @Override
    public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException {
        System.out.println("BeanDestroyProcessor - " + beanName + "即将销毁");
    }
}
