package cn.codeartist.spring.aop.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.StreamUtils;

import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("cn.codeartist.spring.aop.resource");
        BeanExample bean = applicationContext.getBean(BeanExample.class);
        String file = StreamUtils.copyToString(new FileInputStream(bean.getFile()), StandardCharsets.UTF_8);
        System.out.println(file);
    }
}
