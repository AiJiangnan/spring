package cn.codeartist.spring.bean.xml;

public class BeanProvider {

    public BeanProvider() {
        System.out.println("BeanProvider.BeanProvider");
    }

    public void sayHello(String name, Integer year) {
        System.out.println("name = [" + name + "], year = [" + year + "]");
    }
}
