package cn.codeartist.spring.resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StreamUtils;

import java.nio.charset.StandardCharsets;

/**
 * @author 艾江南
 * @date 2019/1/31
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("cn.codeartist.spring.resource");

        Resource[] resources = applicationContext.getResources("classpath:test/test-*.txt");
        for (Resource resource : resources) {
            System.out.println(resource.getDescription());
        }
        ClassPathResource classPathResource = new ClassPathResource("test/test-one.txt");
        String data = StreamUtils.copyToString(classPathResource.getInputStream(), StandardCharsets.UTF_8);
        System.out.println(classPathResource.getPath());
        System.out.println(classPathResource.getURL());
        System.out.println(classPathResource.getDescription());
        System.out.println(data);
    }
}
