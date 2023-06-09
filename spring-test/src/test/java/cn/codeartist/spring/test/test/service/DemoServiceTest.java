package cn.codeartist.spring.test.test.service;

import cn.codeartist.spring.test.service.DemoService;
import cn.codeartist.spring.test.test.AbstractSpringRunnerTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/16
 */
public class DemoServiceTest extends AbstractSpringRunnerTests {

    @Autowired
    private DemoService demoService;

    @Test
//    @Repeat(3)
//    @Timed(millis = 300)
    public void service() {
        demoService.service();
    }
}