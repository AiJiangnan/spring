package cn.codeartist.spring.config;

import cn.codeartist.spring.bean.BeanProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * AppConfigB
 *
 * @author 艾江南
 * @since 2019-01-06
 */
@Configuration
public class AppConfigB {

    @Bean
    public BeanProvider beanProvider() {
        return new BeanProvider();
    }

}
