package cn.codeartist.spring.bean.multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTest {

    @Autowired
    private List<BeanService> beanServices;
    @Autowired
    private BeanService oneServiceImpl;

    public void run() {
        beanServices.forEach(BeanService::run);
    }
}
