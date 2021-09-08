package cn.codeartist.spring.test.test.spring;

import cn.codeartist.spring.test.TestApplication;
import cn.codeartist.spring.test.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 艾江南
 * @date 2021/1/15
 */
@RunWith(SpringRunner.class)
//@BootstrapWith(DefaultTestContextBootstrapper.class)
@ContextConfiguration(classes = TestApplication.class)
//@SpringJUnitConfig(TestApplication.class)
//@TestExecutionListeners(listeners = {CustomTestExecutionListener.class}, mergeMode = TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS)
public class SpringTest {

    @Autowired
    private DemoService demoService;

    @Test
    public void demo() {
        String res = demoService.service();
        System.out.println(res);
    }
}
