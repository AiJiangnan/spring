package cn.codeartist.spring.bean.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.codeartist.spring.bean.mix")
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
