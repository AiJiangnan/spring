package cn.codeartist.spring.config;

import cn.codeartist.spring.bean.BeanExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Main
 *
 * @author 艾江南
 * @since 2019-01-05
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        BeanExample beanExample = applicationContext.getBean(BeanExample.class);
        beanExample.run();
        beanExample.test();
        EmailService emailService = applicationContext.getBean(EmailService.class);
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        emailService.setBlackList(list);
        emailService.sendEmail("123", "11");
        applicationContext.close();
    }

}
