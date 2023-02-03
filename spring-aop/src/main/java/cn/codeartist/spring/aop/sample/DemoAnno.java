package cn.codeartist.spring.aop.sample;

import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * @author 艾江南
 * @date 2023/2/3
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface DemoAnno {

    int value() default 0;
}
