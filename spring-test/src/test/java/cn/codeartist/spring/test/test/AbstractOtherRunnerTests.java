package cn.codeartist.spring.test.test;

import org.junit.ClassRule;
import org.junit.Rule;
import org.springframework.test.context.junit4.rules.SpringClassRule;
import org.springframework.test.context.junit4.rules.SpringMethodRule;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
public class AbstractOtherRunnerTests extends AbstractSpringRunnerTests {

    @ClassRule
    public static final SpringClassRule springClassRule = new SpringClassRule();

    @Rule
    public final SpringMethodRule springMethodRule = new SpringMethodRule();
}
