package cn.codeartist.spring.test.test.junit;

import cn.codeartist.spring.test.test.service.DemoSuiteTest1;
import cn.codeartist.spring.test.test.service.DemoSuiteTest2;
import cn.codeartist.spring.test.test.service.DemoSuiteTest3;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({DemoSuiteTest1.class, DemoSuiteTest2.class, DemoSuiteTest3.class})
public class DemoSuiteTest {
}
