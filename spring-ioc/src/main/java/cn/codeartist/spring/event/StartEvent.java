package cn.codeartist.spring.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

/**
 * StartEvent
 *
 * @author 艾江南
 * @since 2019-01-06
 */
public class StartEvent implements ApplicationListener<ContextStartedEvent> {

    @Override
    public void onApplicationEvent(ContextStartedEvent event) {
        System.out.println("StartEvent.onApplicationEvent");
    }
}
