package cn.codeartist.spring.aop.proxy;

public class DemoServiceImpl implements DemoService {

    @Override
    public void doService() {
        System.out.println("DemoServiceImpl.doService");
    }
}
