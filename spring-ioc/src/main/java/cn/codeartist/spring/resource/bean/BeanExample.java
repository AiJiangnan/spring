package cn.codeartist.spring.resource.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

/**
 * @author 艾江南
 * @date 2019/3/3
 */
@Component
public class BeanExample/* implements ResourceLoaderAware*/ {

    @Autowired
    private ResourceLoader resourceLoader;

    //    @Override
//    public void setResourceLoader(ResourceLoader resourceLoader) {
//        this.resourceLoader = resourceLoader;
//    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
