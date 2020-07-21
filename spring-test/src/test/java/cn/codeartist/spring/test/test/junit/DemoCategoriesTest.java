package cn.codeartist.spring.test.test.junit;

import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/20
 */
@RunWith(Categories.class)
@Categories.IncludeCategory(FastTests.class)
@Categories.ExcludeCategory(SlowTests.class)
@Suite.SuiteClasses({Test1.class, Test2.class, Test3.class})
public class DemoCategoriesTest {
}
