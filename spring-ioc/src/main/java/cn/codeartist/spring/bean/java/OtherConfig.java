package cn.codeartist.spring.bean.java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OtherConfig {

    @Bean
    public BeanProvider beanProvider() {
        return new BeanProvider();
    }
}
