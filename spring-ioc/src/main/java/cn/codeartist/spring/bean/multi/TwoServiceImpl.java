package cn.codeartist.spring.bean.multi;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(2)
@Service
public class TwoServiceImpl implements BeanService {

    @Override
    public void run() {
        System.out.println("TwoServiceImpl.run");
    }
}
