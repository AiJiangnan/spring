package cn.codeartist.spring.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class CustomService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    public void publish() {
        CustomEvent event = new CustomEvent(this, "CodeArtist");
        publisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.publisher = applicationEventPublisher;
    }
}
