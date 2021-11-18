package cn.codeartist.spring.bean.multi;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Order(3)
@Service
public class ThreeServiceImpl implements BeanService {

    @Override
    public void run() {
        System.out.println("ThreeServiceImpl.run");
    }
}
