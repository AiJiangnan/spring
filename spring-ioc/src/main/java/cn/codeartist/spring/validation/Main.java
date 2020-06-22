package cn.codeartist.spring.validation;

import cn.codeartist.spring.validation.bean.PersonForm;
import cn.codeartist.spring.validation.validator.PersonFormService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 艾江南
 * @date 2019/3/19
 */
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValidationConfig.class);
//        Person person = new Person();
//        person.setName("ajn");
//        person.setAge(10000);
//        BindException bindException = new BindException(person, "person");
//        new PersonValidator().validate(person, bindException);
//        ObjectError error = bindException.getAllErrors().get(0);
//        System.out.println(error.getObjectName());
//        System.out.println(Arrays.toString(error.getArguments()));
//        System.out.println(Arrays.toString(error.getCodes()));
//        System.out.println(error.getDefaultMessage());
        PersonFormService bean = context.getBean(PersonFormService.class);
        PersonForm person = new PersonForm();
        bean.test(person);
    }

}
