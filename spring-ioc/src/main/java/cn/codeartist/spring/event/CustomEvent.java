package cn.codeartist.spring.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

    private final String name;

    public CustomEvent(Object source, String name) {
        super(source);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
