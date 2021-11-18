package cn.codeartist.spring.bean.multi;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(1)
@Service
public class OneServiceImpl implements BeanService {

    @Override
    public void run() {
        System.out.println("OneServiceImpl.run");
    }
}
