package org.demoejb.cdi;

import org.demoejb.cdi.annotations.SecondBean;

import javax.ejb.Stateless;

@Stateless(name = "mySecondBean")
@SecondBean
public class OtherBeanImpl implements MyBean {

    @Override
    public String getSomeValue() {
        return "mySecondBean";
    }
}
