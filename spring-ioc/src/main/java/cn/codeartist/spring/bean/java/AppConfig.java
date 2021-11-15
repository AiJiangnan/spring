package cn.codeartist.spring.bean.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BeanExample beanExample() {
        return new BeanExample();
    }

    @Bean
    public BeanProvider beanProvider() {
        return new BeanProvider();
    }
}
