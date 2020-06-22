package cn.codeartist.spring.validation.validator;

import cn.codeartist.spring.validation.bean.PersonForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

/**
 * @author 艾江南
 * @date 2019/6/7
 */
@Service
public class PersonFormService {

    @Autowired
    private Validator validator;

    public void test(PersonForm personForm) {
        Set<ConstraintViolation<PersonForm>> validate = validator.validate(personForm);
        System.out.println(validate);
        validate.forEach(val -> {
            System.out.println(val.getMessage());
        });
    }
}
