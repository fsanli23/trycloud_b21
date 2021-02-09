package com.trycloud.tests.user_story_5;

import com.trycloud.tests.user_story_1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCase5_1 {

    @Test
    public void AccessToContactsModule() throws InterruptedException {
        LoginToWebsite.loginTrycloud();


        //3- Click to Contacts
        //To be able to click, we need to locate the web element from the page
        Driver.getDriver().findElement(By.xpath("//a[@aria-label='Contacts']")).click();
        //4- Verify title contains:
        //Expected: Contacts
        String expectedInTitle = "Contacts";
        String actualTitle = Driver.getDriver().getTitle();
        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.err.println("Title verification FAILED!!!");
        }
        Driver.getDriver().close();
    }

}

/*
5.Story: As a user, I should be able to access to Contacts module.
Test case #1 - verify users can access to Contact module
1.Login as a user.
2.Click “Contacts” module.
3.Verify the page title is Contents module’s title.
 */







