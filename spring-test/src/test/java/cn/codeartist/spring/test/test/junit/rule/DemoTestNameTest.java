package cn.codeartist.spring.test.test.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoTestNameTest {

    @Rule
    public final TestName testName = new TestName();

    @Test
    public void test() {
        System.out.println("DemoTestNameTest.test::" + testName.getMethodName());
    }
}
