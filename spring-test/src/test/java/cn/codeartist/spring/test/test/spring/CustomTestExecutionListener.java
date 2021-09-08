package cn.codeartist.spring.test.test.spring;

import org.springframework.test.context.TestContext;
import org.springframework.test.context.TestExecutionListener;

/**
 * @author 艾江南
 * @date 2021/1/15
 */
public class CustomTestExecutionListener implements TestExecutionListener {

    @Override
    public void beforeTestClass(TestContext testContext) throws Exception {
        System.out.println("CustomTestExecutionListener.beforeTestClass");
    }

    @Override
    public void prepareTestInstance(TestContext testContext) throws Exception {
        System.out.println("CustomTestExecutionListener.prepareTestInstance");
    }

    @Override
    public void beforeTestMethod(TestContext testContext) throws Exception {
        System.out.println("CustomTestExecutionListener.beforeTestMethod");
    }

    @Override
    public void beforeTestExecution(TestContext testContext) throws Exception {
        System.out.println("CustomTestExecutionListener.beforeTestExecution");
    }

    @Override
    public void afterTestExecution(TestContext testContext) throws Exception {
        System.out.println("CustomTestExecutionListener.afterTestExecution");
    }

    @Override
    public void afterTestMethod(TestContext testContext) throws Exception {
        System.out.println("CustomTestExecutionListener.afterTestMethod");
    }

    @Override
    public void afterTestClass(TestContext testContext) throws Exception {
        System.out.println("CustomTestExecutionListener.afterTestClass");
    }
}
