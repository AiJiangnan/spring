package cn.codeartist.spring.resource.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @author 艾江南
 * @date 2019/3/3
 */
@Component
public class BeanExample {

    @Value("classpath:test/test-one.txt")
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
