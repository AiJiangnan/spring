package cn.codeartist.spring.test.test.junit;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

/**
 * jnai
 *
 * @author 艾江南
 * @date 2020/7/21
 */
public class BetweenSupplier extends ParameterSupplier {

    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature sig) throws Throwable {
        List<PotentialAssignment> list = new ArrayList<>();
        Between between = sig.getAnnotation(Between.class);
        for (int i = between.first(); i <= between.last(); i++) {
            list.add(PotentialAssignment.forValue("between", i));
        }
        return list;
    }
}