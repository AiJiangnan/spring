package cn.codeartist.spring.config;

import cn.codeartist.spring.bean.BeanExample;
import cn.codeartist.spring.bean.BeanProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * AppConfig
 *
 * @author 艾江南
 * @since 2019-01-05
 */
@Configuration
@ComponentScan("cn.codeartist.spring")
@PropertySource("classpath:spring.properties")
@PropertySource("classpath:${name}.properties")
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
