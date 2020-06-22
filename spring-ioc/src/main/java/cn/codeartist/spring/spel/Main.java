package cn.codeartist.spring.spel;

import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @author 艾江南
 * @date 2019/4/3
 */
public class Main {

    public static void main(String[] args) {
//        ExpressionParser parser = new SpelExpressionParser();
//        Expression exp = parser.parseExpression("'Hello world'.concat('!')");
//        String message = (String) exp.getValue();
//        System.out.println(message);
//
//        exp = parser.parseExpression("'Hello World'.bytes.length");
//        Integer value = exp.getValue(Integer.class);
//        System.out.println(value);

        ExpressionParser parser = new SpelExpressionParser();
        String helloWorld = (String) parser.parseExpression("'Hello World'").getValue();
        double avogadrosNumber = (Double) parser.parseExpression("6.0221415E+23").getValue();
        int maxValue = (Integer) parser.parseExpression("0x7FFFFFFF").getValue();
        boolean trueValue = (Boolean) parser.parseExpression("true").getValue();
        Object nullValue = parser.parseExpression("null").getValue();
    }
}
