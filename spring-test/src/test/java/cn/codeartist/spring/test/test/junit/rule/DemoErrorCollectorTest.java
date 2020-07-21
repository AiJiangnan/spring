package cn.codeartist.spring.test.test.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoErrorCollectorTest {

    @Rule
    public final ErrorCollector collector = new ErrorCollector();

    @Test
    public void test() {
        try {
            System.out.println("DemoErrorCollectorTest.test::First exception");
            int a = 1 / 0;
        } catch (Exception e) {
            collector.addError(e);
        }
        try {
            System.out.println("DemoErrorCollectorTest.test::Second exception");
            String a = null;
            System.out.println(a.getBytes());
        } catch (Exception e) {
            collector.addError(e);
        }
    }
}
