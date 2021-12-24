package cn.codeartist.spring.resource;

import cn.codeartist.spring.resource.bean.BeanExample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.util.StreamUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * @author 艾江南
 * @date 2019/1/31
 */
public class Main {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext("cn.codeartist.spring.resource");

        // Resource
        Resource resource = new ClassPathResource("test/test-one.txt");
        System.out.println("Filename: " + resource.getFilename());
        System.out.println("Description: " + resource.getDescription());
        System.out.println("URI: " + resource.getURI());
        System.out.println("URL: " + resource.getURL());
        System.out.println("Data: " + streamToString(resource));
        System.out.println();

        // UrlResource
        UrlResource fileResource = new UrlResource("file:E:/codeartist/spring/spring-ioc/src/main/resources/test/test-one.txt");
        System.out.println("File resource: " + streamToString(fileResource));
        UrlResource httpResource = new UrlResource("https://www.baidu.com/");
        System.out.println("Http resource: " /*+ streamToString(httpResource)*/);

        // ClassPathResource
        ClassPathResource classPathResource = new ClassPathResource("test/test-one.txt");
        System.out.println("ClassPath resource: " + streamToString(classPathResource));

        // FileSystemResource
        FileSystemResource fileSystemResource = new FileSystemResource("E:/codeartist/spring/spring-ioc/src/main/resources/test/test-two.txt");
        System.out.println("FileSystem resource: " + streamToString(fileSystemResource));

        System.out.println();

        resource = applicationContext.getResource("classpath:test/test-three.txt");
        System.out.println(streamToString(resource));
        Resource[] resources = applicationContext.getResources("classpath:test/test-*.txt");
        for (Resource res : resources) {
            System.out.println(res.getDescription());
        }

        // 注入Resources
        BeanExample bean = applicationContext.getBean(BeanExample.class);
        String data = StreamUtils.copyToString(new FileInputStream(bean.getFile()), StandardCharsets.UTF_8);
        System.out.println(data);
    }

    private static String streamToString(Resource resource) throws IOException {
        return StreamUtils.copyToString(resource.getInputStream(), StandardCharsets.UTF_8);
    }
}
