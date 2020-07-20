package cn.codeartist.spring.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author 艾江南
 * @date 2020/7/15
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private Environment environment;

    @Override
    public void service() {
        System.out.println("Profile: " + Arrays.toString(environment.getActiveProfiles()));
        System.out.println("DemoServiceImpl.service");
    }

    @Override
    public String service(String str) {
        System.out.println("DemoServiceImpl.service::" + str);
        return str;
    }
}
