package cn.codeartist.spring.test.test.junit;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assume.*;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoAssumeTest {

    @Test
    public void test() {
        int a = 2;
        Object object = new Object();
        assumeTrue("Assume true", true);
        assumeFalse("Assume false", false);
        assumeNotNull(object);
        assumeNoException("Assume no exception", new RuntimeException());
        assumeThat("Assume that", a, is(3));
    }
}
