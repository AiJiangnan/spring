package cn.codeartist.spring.test.test.spring;

import cn.codeartist.spring.test.service.DemoService;
import cn.codeartist.spring.test.test.AbstractOtherRunnerTests;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
@RunWith(Parameterized.class)
public class DemoParameterizedTest extends AbstractOtherRunnerTests {

    @Parameterized.Parameter
    public String param;

    @Autowired
    private DemoService demoService;

    @Parameterized.Parameters(name = "{index}: {0}")
    public static String[] data() {
        return new String[]{"ajn", "yfl", "ayn"};
    }

    @Test
    public void service() {
        demoService.service();
    }
}
