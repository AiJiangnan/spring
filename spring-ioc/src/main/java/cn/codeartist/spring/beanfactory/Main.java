package cn.codeartist.spring.beanfactory;

import cn.codeartist.spring.beanfactory.bean.BeanExample;
import cn.codeartist.spring.beanfactory.bean.BeanProvider;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * Main
 *
 * @author 艾江南
 * @since 2018-12-30
 */
public class Main {

    public static void main(String[] args) {
        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("bean.xml"));
        BeanExample beanExample = (BeanExample) beanFactory.getBean("beanExample");
        BeanProvider beanProvider = (BeanProvider) beanFactory.getBean("beanProvider");
        beanExample.run();
        beanProvider.sayHello("ajn", 25);
    }
}
