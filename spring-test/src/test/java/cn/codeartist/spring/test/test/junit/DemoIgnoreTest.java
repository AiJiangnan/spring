package cn.codeartist.spring.test.test.junit;

import org.junit.Ignore;
import org.junit.Test;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
public class DemoIgnoreTest {

    @Test
    @Ignore("This test method is ignored.")
    public void test() {
        System.out.println("DemoIgnoreTest.test");
    }

    @Test
    public void test2() {
        System.out.println("DemoIgnoreTest.test2");
    }
}
