package cn.codeartist.spring.bean.life;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "exit")
    public OneBeanExample oneBeanExample() {
        return new OneBeanExample();
    }

    @Bean
    public TwoBeanExample twoBeanExample() {
        return new TwoBeanExample();
    }
}
