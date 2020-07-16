package cn.codeartist.spring.aop.service;

/**
 * @author 艾江南
 * @date 2020/6/23
 */
public class AopService {

    public void doService() {
        System.out.println("AopService.doService");
    }

    public String doService(String param) {
        System.out.println("AopService.doService::" + param);
        return "ajn";
    }

    public void doServiceException() {
        System.out.println("AopService.doServiceException");
        int a = 1 / 0;
    }
}
