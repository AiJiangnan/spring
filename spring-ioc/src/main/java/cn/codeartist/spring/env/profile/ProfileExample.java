package cn.codeartist.spring.env.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class ProfileExample {

    public ProfileExample() {
        System.out.println("ProfileExample.ProfileExample");
    }
}
