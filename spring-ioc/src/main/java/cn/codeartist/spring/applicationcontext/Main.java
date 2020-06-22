package cn.codeartist.spring.applicationcontext;

import cn.codeartist.spring.resource.bean.BeanExample;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

/**
 * Main
 *
 * @author 艾江南
 * @since 2018-12-30
 */
public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        BeanExample bean = (BeanExample) applicationContext.getBean("beanExample");
        ResourceLoader resourceLoader = bean.getResourceLoader();
        Resource resource = resourceLoader.getResource("ajn.properties");
        System.out.println(resourceLoader == applicationContext);
        System.out.println(resource);
        applicationContext.close();
    }

}
