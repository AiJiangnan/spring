package cn.codeartist.spring.test.test.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoTimeoutTest {

    @Rule
    public final Timeout timeout = Timeout.seconds(1);

    @Test
    public void test() throws InterruptedException {
        TimeUnit.SECONDS.sleep(2);
        System.out.println("DemoTimeoutTest.test");
    }
}
