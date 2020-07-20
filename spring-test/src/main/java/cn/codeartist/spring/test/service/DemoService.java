package cn.codeartist.spring.test.service;

/**
 * @author 艾江南
 * @date 2020/7/15
 */
public interface DemoService {

    /**
     * do somethings
     */
    void service();

    /**
     * do something with parameter
     *
     * @param str 参数
     * @return 返回
     */
    String service(String str);
}
