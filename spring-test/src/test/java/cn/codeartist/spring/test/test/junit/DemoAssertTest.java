package cn.codeartist.spring.test.test.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
@RunWith(JUnit4.class)
public class DemoAssertTest {

    @Test
    public void assertTest() {
        int a = 5;
        assert a < 0;
        assert a < 0 : "整数为正数";
    }

    @Test
    public void assertJUnitTest() {
        int a = 2;
        Object expected = new Object();
        Object actual = new Object();
        assertTrue("条件为假", a > 1);
        assertFalse("条件为真", a > 4);
        assertEquals("整数与期望的数不相等", 100, 80);
        assertNotEquals("整数与期望的数相等", 100, 80);
        assertArrayEquals("", new Integer[]{1, 2, 3, 4, 5}, new Integer[]{1, 2, 3, 4, 5});
        assertNotNull("", actual);
        assertNull("", actual);
        assertSame("", expected, actual);
        assertNotSame("", expected, actual);
    }
}
