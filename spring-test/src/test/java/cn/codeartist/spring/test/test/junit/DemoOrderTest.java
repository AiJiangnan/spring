package cn.codeartist.spring.test.test.junit;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DemoOrderTest {

    @Test
    public void testB() {
        System.out.println("DemoOrderTest.testB");
    }

    @Test
    public void testA() {
        System.out.println("DemoOrderTest.testA");
    }

    @Test
    public void testC() {
        System.out.println("DemoOrderTest.testC");
    }
}
