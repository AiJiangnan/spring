package cn.codeartist.spring.test.test.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExternalResource;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoExternalResourceTest {

    @Rule
    public final ExternalResource externalResource = new ExternalResource() {
        @Override
        protected void before() {
            System.out.println("DemoExternalResourceTest.before");
        }

        @Override
        protected void after() {
            System.out.println("DemoExternalResourceTest.after");
        }
    };

    @Test
    public void test() {
        System.out.println("DemoExternalResourceTest.test");
    }
}
