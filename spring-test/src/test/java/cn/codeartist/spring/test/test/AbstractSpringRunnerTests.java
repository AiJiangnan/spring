package cn.codeartist.spring.test.test;

import cn.codeartist.spring.test.TestApplication;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author 艾江南
 * @date 2020/7/15
 */
@RunWith(SpringRunner.class)
@ActiveProfiles("local")
@SpringBootTest(classes = TestApplication.class)
public abstract class AbstractSpringRunnerTests {

    protected final Logger logger = LoggerFactory.getLogger(getClass());
}
