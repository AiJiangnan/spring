package cn.codeartist.spring.aop.pointcut;

import org.springframework.stereotype.Service;

@Demo
@Service
public class DemoServiceImpl implements DemoService {

    @Demo
    @Override
    public void doService(Example name) {
        System.out.println("DemoServiceImpl.doService: " + name);
    }
}
