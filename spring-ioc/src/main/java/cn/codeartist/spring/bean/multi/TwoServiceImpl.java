package cn.codeartist.spring.bean.multi;

public class TwoServiceImpl implements BeanService {

    @Override
    public void run() {
        System.out.println("TwoServiceImpl.run");
    }
}
