package cn.codeartist.spring.test.test.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Verifier;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoVerifierTest {

    private static String result = "";

    @Rule
    public final Verifier verifier = new Verifier() {
        @Override
        protected void verify() {
            result += "verify";
        }
    };

    @Test
    public void test() {
        System.out.println("DemoVerifierTest.test::" + result);
    }

    @Test
    public void test2() {
        System.out.println("DemoVerifierTest.test::" + result);
    }
}
