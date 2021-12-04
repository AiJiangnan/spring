package cn.codeartist.spring.env.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProfileProdExample {

    public ProfileProdExample() {
        System.out.println("ProfileProdExample.ProfileProdExample");
    }
}
