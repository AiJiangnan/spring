package cn.codeartist.spring.test.test;

import cn.codeartist.spring.test.service.DemoService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.annotation.Timed;

/**
 * @author 艾江南
 * @date 2020/7/15
 */
public class DemoServiceTest extends BaseTest {

    @Autowired
    private DemoService demoService;

    @Test
    @Repeat(3)
    @Timed(millis = 300)
    public void service() {
        demoService.service();
    }
}
