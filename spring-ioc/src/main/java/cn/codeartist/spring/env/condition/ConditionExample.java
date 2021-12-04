package cn.codeartist.spring.env.condition;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@Conditional(CustomCondition.class)
public class ConditionExample {

    public ConditionExample() {
        System.out.println("ConditionExample.ConditionExample");
    }
}
