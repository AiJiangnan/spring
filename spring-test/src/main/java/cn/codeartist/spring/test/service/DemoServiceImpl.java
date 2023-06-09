package cn.codeartist.spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 艾江南
 * @date 2020/7/15
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoService1 demoService1;

    @Override
    public void service() {
        System.out.println("DemoServiceImpl.service");
        demoService1.service();
    }

    @Override
    public void service(String str) {
        System.out.println("DemoServiceImpl.service::" + str);
    }
}
