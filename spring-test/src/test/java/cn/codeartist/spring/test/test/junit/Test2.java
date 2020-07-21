package cn.codeartist.spring.test.test.junit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
@Category({FastTests.class, SlowTests.class})
public class Test2 {

    @Test
    public void test() {
        System.out.println("Test2.test");
    }

    @Test
    public void test2() {
        System.out.println("Test2.test2");
    }
}
