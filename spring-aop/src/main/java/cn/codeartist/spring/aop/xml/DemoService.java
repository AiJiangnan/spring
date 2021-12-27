package cn.codeartist.spring.aop.xml;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public void doService() {
        System.out.println("DemoService.doService");
    }

    public void doException() {
        System.out.println("DemoService.doException");
        throw new RuntimeException();
    }
}
