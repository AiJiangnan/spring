package cn.codeartist.spring.resource.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @author 艾江南
 * @date 2019/3/3
 */
@Data
@Component
public class BeanExample {

    @Value("classpath:test/test-one.txt")
    private Resource resource;
    @Value("classpath:test/test-two.txt")
    private File file;
}
