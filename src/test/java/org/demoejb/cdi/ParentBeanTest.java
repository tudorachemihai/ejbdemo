package org.demoejb.cdi;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.ejb.EJB;
import javax.ejb.embeddable.EJBContainer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ParentBeanTest {

    private static EJBContainer container;

    @EJB
    private ParentBean parentBean;

    @BeforeClass
    public static void start() {
        container = EJBContainer.createEJBContainer();
    }

    @Before
    public void setUp() throws Exception {
        container.getContext().bind("inject", this);
    }

    @Test
    public void test() {
        System.out.println("Testing....");

        assertNotNull(parentBean);
        assertNotNull(parentBean.getMyBean());
        assertNotNull(parentBean.getSomeParentValue());
        assertNotNull(parentBean.getMyBean().getSomeValue());
        assertEquals("testbean", parentBean.getMyBean().getSomeValue());
    }

    @AfterClass
    public static void stop() {
        container.close();
    }
}
