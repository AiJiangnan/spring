package cn.codeartist.spring.config;

import cn.codeartist.spring.event.BlackListEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @author 艾江南
 * @date 2019/1/17
 */
@Service
public class BlackListNotifier {

    @EventListener
    public void onApplicationEvent(BlackListEvent event) {
        System.out.println("BlackListNotifier.onApplicationEvent：" + event.toString());
    }
}
