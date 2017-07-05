package org.demoejb.cdi;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class ParentBean {

    private String someParentValue;

    @Inject
    private MyBean myBean;

    @PostConstruct
    private void init() {
        System.out.println("myBean = " + myBean.toString());
        someParentValue = "test";
    }

    public MyBean getMyBean() {
        return myBean;
    }

    public String getSomeParentValue() {
        return someParentValue;
    }

    public void setSomeParentValue(String someParentValue) {
        this.someParentValue = someParentValue;
    }
}
