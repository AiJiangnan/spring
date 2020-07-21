package cn.codeartist.spring.test.test.junit;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
public class Test1 {

    @Test
    public void test() {
        System.out.println("Test1.test");
    }

    @Test
    @Category(FastTests.class)
    public void test2() {
        System.out.println("Test1.test2");
    }
}
