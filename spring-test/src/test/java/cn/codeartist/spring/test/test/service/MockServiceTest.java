package cn.codeartist.spring.test.test.service;

import cn.codeartist.spring.test.service.DemoService;
import cn.codeartist.spring.test.service.DemoService1;
import cn.codeartist.spring.test.test.AbstractSpringRunnerTests;
import org.junit.Before;
import org.junit.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/16
 */
public class MockServiceTest extends AbstractSpringRunnerTests {

    @Autowired
    private DemoService demoService;
    @MockBean
    private DemoService1 demoService1;


    @Before
    public void mock() {
        BDDMockito.doAnswer(invocation -> {
            System.out.println("Mock service.");
            return null;
        }).when(demoService1).service();
    }

    @Test
//    @Repeat(3)
//    @Timed(millis = 300)
    public void service() {
        demoService.service();
    }
}