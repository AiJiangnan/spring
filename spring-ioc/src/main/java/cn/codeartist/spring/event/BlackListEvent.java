package cn.codeartist.spring.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author 艾江南
 * @date 2019/1/16
 */
public class BlackListEvent extends ApplicationEvent {

    private String address;
    private String content;

    public BlackListEvent(Object source, String address, String content) {
        super(source);
        this.address = address;
        this.content = content;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "BlackListEvent{" +
                "address='" + address + '\'' +
                ", content='" + content + '\'' +
                ", source=" + source +
                '}';
    }
}
