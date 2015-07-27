package com.neska.ejb.client;

import javax.ejb.embeddable.*;
import javax.naming.Context;
import javax.naming.NamingException;

public class Main {

    public static void main(String [ ] args) throws NamingException{

        EJBContainer ec = EJBContainer.createEJBContainer();
        Context ctx = ec.getContext();
        MySessionBean msb = (MySessionBean) ctx.lookup("java:global/mySessionBean/MySessionBean");
    }


}
