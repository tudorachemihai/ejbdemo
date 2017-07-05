package org.demoejb.cdi;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

@Stateless
public class MyBeanImpl implements MyBean {

    private String someValue;

    public String getSomeValue() {
        return someValue;
    }

    @PostConstruct
    public void init() {
        System.out.println("Creating MyBeanImpl...");
        someValue = "testbean";
    }
}
