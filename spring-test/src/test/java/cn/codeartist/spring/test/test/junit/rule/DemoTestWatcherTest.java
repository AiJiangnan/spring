package cn.codeartist.spring.test.test.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoTestWatcherTest {

    @Rule
    public final TestWatcher watcher = new TestWatcher() {
        @Override
        protected void starting(Description description) {
            System.out.println("DemoTestWatcherTest.starting");
        }

        @Override
        protected void succeeded(Description description) {
            System.out.println("DemoTestWatcherTest.succeeded");
        }

        @Override
        protected void finished(Description description) {
            System.out.println("DemoTestWatcherTest.finished");
        }
    };

    @Test
    public void test() {
        System.out.println("DemoTestWatcherTest.test");
    }
}
