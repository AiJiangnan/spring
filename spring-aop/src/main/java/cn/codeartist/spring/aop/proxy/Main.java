package cn.codeartist.spring.aop.proxy;

import org.springframework.cglib.proxy.Enhancer;

/**
 * @author 艾江南
 * @date 2020/7/19
 */
public class Main {

    public static void main(String[] args) {

        // JDK Proxy
        DemoService demoService = new DemoServiceImpl();
        DemoServiceProxy proxy = new DemoServiceProxy();
        DemoService proxyTarget = (DemoService) proxy.getTarget(demoService);
        proxyTarget.doService();

        // CGLib Proxy
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(DemoServiceImpl.class);
        enhancer.setCallback(new DemoServiceInterceptor());
        DemoService service = (DemoService) enhancer.create();
        service.doService();
    }
}
