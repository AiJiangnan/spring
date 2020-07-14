package cn.codeartist.spring.beanfactory.bean;

/**
 * BeanProviderFactory
 *
 * @author 艾江南
 * @since 2018-12-31
 */
public class BeanProviderFactory {

    public static BeanProvider getBeanProvider() {
        return new BeanProvider();
    }

}
