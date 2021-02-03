package com.trycloud.utilities;

//  We will create utility methods for repeated steps that can be used.
//  in browser, and store in this

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserUtils {

    // Create method name:  wait
    // Converting milliseconds to second
    // handle checked exception


    /**
     * Pause test for some time
     *
     * @param second
     */
    public static void sleep(int second) {
        second *= 1000l;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            System.out.println("Something is wrong in the sleep method.");
        }
    }

//Try
}
