package cn.codeartist.spring.bean.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class BeanExample {

    private String name;
    private Integer year;
    @Autowired
    private BeanProvider beanProvider;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BeanProvider getBeanProvider() {
        return beanProvider;
    }

    public void setBeanProvider(BeanProvider beanProvider) {
        this.beanProvider = beanProvider;
    }
}
