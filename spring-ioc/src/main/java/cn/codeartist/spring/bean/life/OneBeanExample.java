package cn.codeartist.spring.bean.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class OneBeanExample extends BeanAware implements InitializingBean, DisposableBean {

    public OneBeanExample() {
        System.out.println("OneBeanExample - 构造方法");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("OneBeanExample - 属性装配完成后执行");
    }

    @Override
    public void destroy() {
        System.out.println("OneBeanExample - 容器销毁后Bean销毁");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("OneBeanExample - PostConstruct初始化方法");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("OneBeanExample - PreDestroy销毁方法");
    }

    public void init() {
        System.out.println("OneBeanExample - 自定义的初始化方法");
    }

    public void exit() {
        System.out.println("OneBeanExample - 自定义的销毁方法");
    }
}
