package cn.codeartist.spring.test.service;

import org.springframework.stereotype.Service;

/**
 * @author 艾江南
 * @date 2020/7/15
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String service() {
        return "Real return value";
    }
}
