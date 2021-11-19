package cn.codeartist.spring.bean.multi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ServiceTest {

    @Autowired
    @Qualifier("oneServiceImpl")
    private BeanService beanService;
    @Autowired
    private BeanService oneServiceImpl;

    @Autowired
    private BeanService[] beanServiceArr;
    @Autowired
    private Set<BeanService> beanServiceSet;
    @Autowired
    private List<BeanService> beanServiceList;
    @Autowired
    private Map<String, BeanService> beanServiceMap;

    public void run() {
        beanServiceList.forEach(BeanService::run);
    }
}
