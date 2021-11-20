package cn.codeartist.spring.bean.life;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class TwoBeanExample implements InitializingBean, DisposableBean {

    public TwoBeanExample() {
        System.out.println("TwoBeanExample - 构造方法");
    }

    @Override
    public void afterPropertiesSet() {
        System.out.println("TwoBeanExample - 属性装配完成后执行");
    }

    @Override
    public void destroy() {
        System.out.println("TwoBeanExample - 容器销毁后Bean销毁");
    }
}
