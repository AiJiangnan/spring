package cn.codeartist.spring.test.service;

import org.springframework.stereotype.Service;

/**
 * @author 艾江南
 * @date 2020/7/15
 */
@Service
public class DemoServiceImpl1 implements DemoService1 {

    @Override
    public void service() {
        System.out.println("DemoServiceImpl1.service");
    }

    @Override
    public void service(String str) {
        System.out.println("DemoServiceImpl.service::" + str);
    }
}
