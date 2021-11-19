package cn.codeartist.spring.bean.multi;

public class OneServiceImpl implements BeanService {

    @Override
    public void run() {
        System.out.println("OneServiceImpl.run");
    }
}
