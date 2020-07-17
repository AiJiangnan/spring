package cn.codeartist.spring.aop.pointcut;

import java.lang.annotation.*;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/17
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Demo {
}
