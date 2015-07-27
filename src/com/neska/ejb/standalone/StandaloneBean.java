package com.neska.ejb.standalone;

import javax.ejb.*;

@Stateless
public class StandaloneBean {

    private static final String message = "Greetings!";

    public static final String returnMessage() {
        return message;
    }
}
