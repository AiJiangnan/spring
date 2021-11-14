package cn.codeartist.spring.bean;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * BeanExample
 *
 * @author 艾江南
 * @since 2018-12-30
 */
public class BeanExample {

    private String name;
    private Integer age;
    @Autowired
    private BeanProvider beanProvider;

    public void run() {
        System.out.println("BeanExample.run");
    }

    public void test() {
        System.out.println("BeanExample.test");
    }

    private void init() {
        System.out.println("BeanExample.init");
    }

    private void destroy() {
        System.out.println("BeanExample.destroy");
    }

}