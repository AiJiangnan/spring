package cn.codeartist.spring.bean.xml;

public class BeanExampleFactory {

    private static BeanExample beanExample = new BeanExample();

    public BeanExample getInstance() {
        System.out.println("BeanFactory.getInstance");
        return beanExample;
    }
}
