package cn.codeartist.spring.env;

import cn.codeartist.spring.env.condition.ConditionExample;
import cn.codeartist.spring.env.profile.ProfileExample;
import cn.codeartist.spring.env.profile.ProfileProdExample;
import cn.codeartist.spring.env.property.BeanExample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        environment.setActiveProfiles("dev", "prod");
        environment.setDefaultProfiles("prod");
        applicationContext.scan("cn.codeartist.spring.env");
        applicationContext.refresh();

        applicationContext.getBean(ConditionExample.class);
        applicationContext.getBean(ProfileExample.class);
        applicationContext.getBean(ProfileProdExample.class);

        BeanExample bean = applicationContext.getBean(BeanExample.class);
        System.out.println(bean.getName());
        System.out.println(environment.getProperty("test.value"));
        System.out.println(environment.resolvePlaceholders("test.value=${test.value}"));
    }
}
