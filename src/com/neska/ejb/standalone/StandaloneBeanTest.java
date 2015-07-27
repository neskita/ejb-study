package com.neska.ejb.standalone;

import java.util.logging.Logger;

import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;

import org.junit.*;

public class StandaloneBeanTest {

    private final static Logger logger = Logger.getLogger(StandaloneBeanTest.class.getName());

    Context ctx = null;
    EJBContainer ec = null;

    @Before
    public void setUp() {
        EJBContainer ec = EJBContainer.createEJBContainer();
        this.ctx = ec.getContext();
    }

    @Test
    public void testReturnMessage() throws Exception {
        logger.info("Testing standalone.ejb.StandaloneBean.resturnMessage()");
        StandaloneBean instance = (StandaloneBean) this.ctx.lookup("java:global/classes/StandaloneBean");
        String expResult = "Greetings!";
        String result = instance.returnMessage();
        Assert.assertEquals(expResult, result);
    }

    @After
    public void tearDown() {
        if (ec != null)
            ec.close();
    }
}
