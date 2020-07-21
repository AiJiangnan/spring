package cn.codeartist.spring.test.test.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoRuleChainTest {

    @Rule
    public final RuleChain chain = RuleChain
            .outerRule(new TestLogger("outer rule"))
            .around(new TestLogger("around1 rule"))
            .around(new TestLogger("around2 rule"));

    @Test
    public void test() {
        System.out.println("DemoRuleChainTest.test");
    }
}
