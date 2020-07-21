package cn.codeartist.spring.test.test.junit.rule;

import org.junit.ClassRule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoClassRuleTest {

    @ClassRule
    public static final ExternalResource r = new ExternalResource() {
        @Override
        protected void before() {
            System.out.println("DemoClassRuleTest.before");
        }

        @Override
        protected void after() {
            System.out.println("DemoClassRuleTest.after");
        }
    };

    @Test
    public void test() {
        System.out.println("DemoClassRuleTest.test");
    }

    @Test
    public void test2() {
        System.out.println("DemoClassRuleTest.test2");
    }

}
