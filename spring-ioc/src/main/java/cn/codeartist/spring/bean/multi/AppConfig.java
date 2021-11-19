package cn.codeartist.spring.bean.multi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author 艾江南
 * @date 2021/11/19
 */
@Configuration
public class AppConfig {

    @Bean
    @Order(1)
    public BeanService oneServiceImpl() {
        return new OneServiceImpl();
    }


    @Bean
    @Order(3)
    public BeanService twoServiceImpl() {
        return new TwoServiceImpl();
    }

    @Bean
    @Order(2)
    public BeanService threeServiceImpl() {
        return new ThreeServiceImpl();
    }

    @Bean
    public ServiceTest serviceTest() {
        return new ServiceTest();
    }
}
