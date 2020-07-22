package cn.codeartist.spring.test.test.junit;

import org.junit.*;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoFixtureTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("DemoFixtureTest.beforeClass");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("DemoFixtureTest.afterClass");
    }

    @Before
    public void before() {
        System.out.println("DemoFixtureTest.before");
    }

    @After
    public void after() {
        System.out.println("DemoFixtureTest.after");
    }

    @Test
    public void test() {
        System.out.println("DemoFixtureTest.test");
    }

    @Test
    public void test2() {
        System.out.println("DemoFixtureTest.test2");
    }
}
