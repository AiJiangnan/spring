package cn.codeartist.spring.test.test;

import cn.codeartist.spring.test.TestApplicationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 艾江南
 * @date 2020/7/15
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
@ContextConfiguration(classes = TestApplicationContext.class)
public abstract class AbstractSpringRunnerTests {

    protected final Log logger = LogFactory.getLog(getClass());
}
