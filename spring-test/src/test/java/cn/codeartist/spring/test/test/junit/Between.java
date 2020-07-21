package cn.codeartist.spring.test.test.junit;

import org.junit.experimental.theories.ParametersSuppliedBy;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
@Target(PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@ParametersSuppliedBy(BetweenSupplier.class)
public @interface Between {

    int first();

    int last();
}
