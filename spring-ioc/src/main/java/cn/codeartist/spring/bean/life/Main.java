package cn.codeartist.spring.bean.life;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        applicationContext.getBean(OneBeanExample.class);
        System.out.println("OneBeanExample - 使用中");
        applicationContext.close();
    }
}
