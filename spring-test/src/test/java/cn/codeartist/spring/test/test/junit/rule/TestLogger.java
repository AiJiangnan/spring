package cn.codeartist.spring.test.test.junit.rule;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class TestLogger implements TestRule {

    private final String message;

    public TestLogger(String message) {
        this.message = message;
    }

    @Override
    public Statement apply(Statement base, Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                System.out.println("TestLogger.evaluate::" + message);
                base.evaluate();
            }
        };
    }
}
