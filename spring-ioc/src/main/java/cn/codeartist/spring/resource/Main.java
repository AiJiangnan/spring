package cn.codeartist.spring.resource;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.UrlResource;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * @author 艾江南
 * @date 2019/1/31
 */
public class Main {

    public static void main(String[] args) throws Exception {
        // 读取文件资源
        UrlResource fileResource = new UrlResource("file://E:/code/csdn/spring/src/main/resources/ajn.properties");
        System.out.println(fileResource.getFile());
        // 读取网络资源
        UrlResource webResource = new UrlResource("http://codeartist.cn");
        InputStream inputStream = webResource.getInputStream();
        byte[] bytes = new byte[1024];
        while (inputStream.read(bytes) > 0) {
            System.out.println(new String(bytes, StandardCharsets.UTF_8));
        }
        inputStream.close();

        ClassPathResource classPathResource = new ClassPathResource("ajn.properties");
        System.out.println(classPathResource.getFile());

        FileSystemResource fileSystemResource = new FileSystemResource("E:/code/csdn/spring/src/main/resources/ajn.properties");
        System.out.println(fileSystemResource.getFile());


    }

}
