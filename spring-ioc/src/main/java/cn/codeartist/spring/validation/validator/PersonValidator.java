package cn.codeartist.spring.validation.validator;

import cn.codeartist.spring.validation.bean.Person;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 * @author 艾江南
 * @date 2019/3/20
 */
public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        ValidationUtils.rejectIfEmpty(errors, "name", "name.empty");
        Person p = (Person) target;
        if (p.getAge() < 0) {
            errors.rejectValue("age", "123123", "Message");
        } else if (p.getAge() > 110) {
            errors.rejectValue("age", "100001", "too.darn.old");
        }
    }
}
