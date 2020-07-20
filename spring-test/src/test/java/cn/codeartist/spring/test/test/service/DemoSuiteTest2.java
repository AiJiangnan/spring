package cn.codeartist.spring.test.test.service;

import cn.codeartist.spring.test.service.DemoService;
import cn.codeartist.spring.test.test.AbstractSpringRunnerTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
public class DemoSuiteTest2 extends AbstractSpringRunnerTests {

    @Autowired
    private DemoService demoService;

    @Test
    public void service() {
        demoService.service("DemoSuiteTest2.service");
    }
}
