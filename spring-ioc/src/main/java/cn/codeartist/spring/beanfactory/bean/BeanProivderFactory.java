package cn.codeartist.spring.beanfactory.bean;

/**
 * BeanProivderFactory
 *
 * @author 艾江南
 * @since 2018-12-31
 */
public class BeanProivderFactory {

    public static BeanProvider getBeanProvider() {
        return new BeanProvider();
    }

}
