package cn.codeartist.spring.aop.advice;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public String doService() {
        System.out.println("DemoService.doService");
        return "码匠公众号";
    }

    public void doService(String name) {
        System.out.println("DemoService.doService :: " + name);
    }

    public void doServiceThrow() {
        System.out.println("DemoService.doServiceThrow");
        throw new RuntimeException("Test exception");
    }
}
