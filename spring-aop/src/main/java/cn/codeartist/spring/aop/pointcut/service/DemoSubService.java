package cn.codeartist.spring.aop.pointcut.service;

import cn.codeartist.spring.aop.pointcut.Example;
import org.springframework.stereotype.Service;

/**
 * 子类
 *
 * @author 艾江南
 * @date 2022/5/11
 */
@Service
public class DemoSubService {

    public void doService(Example name) {
        System.out.println("DemoSubService.doService: " + name);
    }
}
