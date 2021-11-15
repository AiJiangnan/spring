package cn.codeartist.spring.spel;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.SimpleEvaluationContext;

/**
 * @author 艾江南
 * @date 2019/4/3
 */
public class Main {

    public static void main(String[] args) {
        // create an array of integers
        ExpressionParser parser = new SpelExpressionParser();
        EvaluationContext context = SimpleEvaluationContext.forReadOnlyDataBinding().build();
        context.setVariable("val", 100);

        Boolean value = parser.parseExpression("#val > 110").getValue(context, Boolean.class);
        System.out.println(value);
    }
}
