package cn.codeartist.spring.bean.xml;

public class BeanExample {

    private static final BeanExample beanExample = new BeanExample();

    private String name;
    private Integer year;
    private BeanProvider beanProvider;

    public BeanExample() {
    }

    public BeanExample(String name, Integer year, BeanProvider beanProvider) {
        this.name = name;
        this.year = year;
        this.beanProvider = beanProvider;
    }

    public void run() {
        beanProvider.sayHello(name, year);
    }

    public void hello() {
        System.out.println("Hello CodeArtist");
    }

    public static BeanExample getInstance() {
        System.out.println("BeanExample.getInstance");
        return beanExample;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public BeanProvider getBeanProvider() {
        return beanProvider;
    }

    public void setBeanProvider(BeanProvider beanProvider) {
        this.beanProvider = beanProvider;
    }
}
