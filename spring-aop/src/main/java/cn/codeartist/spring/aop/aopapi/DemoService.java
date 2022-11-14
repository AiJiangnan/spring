package cn.codeartist.spring.aop.aopapi;

import org.springframework.stereotype.Service;

/**
 * 测试服务
 *
 * @author 艾江南
 * @date 2022/11/14
 */
@Service
public class DemoService {

    public void doService() {
        System.out.println("DemoService.doService");
    }
}
