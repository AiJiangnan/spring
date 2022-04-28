package cn.codeartist.spring.aop.pointcut;

import java.lang.annotation.*;

/**
 * 类型方法注解
 *
 * @author 艾江南
 * @date 2022/4/28
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Demo {
}
