package cn.codeartist.spring.aop.bean;

/**
 * @author 艾江南
 * @date 2020/6/24
 */
public class AopServiceApiImpl implements AopServiceApi {
    @Override
    public void doService() {
        System.out.println("AopServiceApiImpl.doService");
    }
}
