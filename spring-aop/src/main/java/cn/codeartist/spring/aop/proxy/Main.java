package cn.codeartist.spring.aop.proxy;

import cn.codeartist.spring.aop.service.AopService;
import cn.codeartist.spring.aop.service.AopServiceApi;
import cn.codeartist.spring.aop.service.AopServiceApiImpl;
import org.springframework.cglib.proxy.Enhancer;

/**
 * @author 艾江南
 * @date 2020/7/19
 */
public class Main {

    public static void main(String[] args) {
        // JDK Proxy
        AopServiceApi aopServiceApi = new AopServiceApiImpl();
        ServiceProxy proxy = new ServiceProxy();
        AopServiceApi proxyTarget = (AopServiceApi) proxy.getTarget(aopServiceApi);
        proxyTarget.doService();
        // CGLib Proxy
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(AopService.class);
        enhancer.setCallback(new ServiceInterceptor());
        AopService service = (AopService) enhancer.create();
        service.doService();
    }
}
