package cn.codeartist.spring.test.test.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
@RunWith(Parameterized.class)
public class DemoParameterTest {

    @Parameter
    public int input1;
    @Parameter(1)
    public int input2;

    @Parameters(name = "{index}:{0}-{1}")
    public static Integer[][] data() {
        return new Integer[][]{
                {1, 11}, {2, 22}, {3, 33}, {4, 44}, {5, 55}
        };
    }

    @Test
    public void test() {
        System.out.println("DemoParameterTest.test::" + input1 + "-" + input2);
    }
}
