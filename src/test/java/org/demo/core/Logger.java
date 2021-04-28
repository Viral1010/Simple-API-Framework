package org.demo.core;

import org.testng.Reporter;

public class Logger {


    public void logTitle(String message)
    {
        System.out.println(message);
        Reporter.log(  "<h1 style=\"font-size:20px\"> "+message+ "</h1></br>") ;
    }

    public void logStep(String message)
    {
        System.out.println(message);
        Reporter.log(message+ "</br></br>") ;
    }
}
