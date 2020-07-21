package cn.codeartist.spring.test.test.junit;

import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
public class DemoTimeoutTest {

    @Test(timeout = 100)
    public void test() throws InterruptedException {
        TimeUnit.SECONDS.sleep(3);
        System.out.println("DemoTimeoutTest.test");
    }
}
