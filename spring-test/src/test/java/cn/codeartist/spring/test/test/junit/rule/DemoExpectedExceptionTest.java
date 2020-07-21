package cn.codeartist.spring.test.test.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.startsWith;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoExpectedExceptionTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    @Test
    public void test() {
        exception.expect(NullPointerException.class);
        exception.expectMessage("happened?");
        exception.expectMessage(startsWith("What"));
        throw new NullPointerException("What happened?");
    }
}
