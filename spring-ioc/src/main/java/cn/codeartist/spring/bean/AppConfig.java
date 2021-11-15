package cn.codeartist.spring.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "cn.codeartist.spring.bean.annotation")
public class AppConfig {
}
