package cn.codeartist.spring.test.test.junit;

import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
@RunWith(Theories.class)
public class DemoTheoriesTest {

    @Theory
    public void test(@Between(first = 1, last = 3) int input1,
                     @Between(first = 4, last = 6) int input2) {
        System.out.println("DemoTheoriesTest.test::" + input1 + "-" + input2);
    }
}
