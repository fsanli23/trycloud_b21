package com.trycloud.utilities;

//  We will create utility methods for repeated steps that can be used.
//  in browser, and store in this

public class BrowserUtils {

    // Create method name:  wait
    // Converting milliseconds to second
    // handle checked exception

    public static void sleep(int second){
        second *=1000l;

        try {

            Thread.sleep(second);

        } catch (InterruptedException e) {

            System.out.println("Something is wrong in the sleep method.");

        }
    }



}
