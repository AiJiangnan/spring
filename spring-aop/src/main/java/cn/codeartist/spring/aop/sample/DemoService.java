package cn.codeartist.spring.aop.sample;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 事务控制
 *
 * @author 艾江南
 * @date 2023/2/3
 */
@Service
public class DemoService {

    @Transactional(rollbackFor = Exception.class)
    public void insertBatch() {
        // 带事务控制的业务操作
    }
}
