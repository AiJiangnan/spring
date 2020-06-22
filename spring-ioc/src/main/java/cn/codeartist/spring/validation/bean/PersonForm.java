package cn.codeartist.spring.validation.bean;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author 艾江南
 * @date 2019/6/7
 */
public class PersonForm {

    @MyConstraint
    @NotNull(message = "name不能为空")
    @Size(max = 64, message = "最大长度为64")
    private String name;

    @Min(0)
    private int age;
}
