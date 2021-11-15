package cn.codeartist.spring.bean.annotation;

import org.springframework.stereotype.Component;

@Component
public class BeanProvider {

    public void sayHello(String name, Integer year) {
        System.out.println("name = [" + name + "], year = [" + year + "]");
    }
}
