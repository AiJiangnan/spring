package cn.codeartist.spring.test.test.junit.rule;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.File;
import java.io.IOException;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class DemoTemporaryFolderTest {

    @Rule
    public final TemporaryFolder folder = new TemporaryFolder();

    @Test
    public void test() throws IOException {
        File createdFile = folder.newFile("codeartist.txt");
        File createdFolder = folder.newFolder("CodeArtist");
        System.out.println("DemoTemporaryFolderTest.test#createdFile: " + createdFile);
        System.out.println("DemoTemporaryFolderTest.test#createdFolder: " + createdFolder);
    }
}
