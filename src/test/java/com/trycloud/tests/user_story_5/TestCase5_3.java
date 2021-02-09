package com.trycloud.tests.user_story_5;

import com.trycloud.tests.user_story_1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase5_3 {

    @Test
    public void VerifyContactList() throws InterruptedException {

        LoginToWebsite.loginTrycloud();

        WebElement Contact = Driver.getDriver().findElement(By.xpath("//a[@aria-label='Contacts']"));
        Thread.sleep(2000);
        Contact.click();

        // WebElement AllContacts = driver.findElement(By.xpath("//div[@class='app-navigation-new']"));
        //(By.xpath("//a[@href='/index.php/apps/contacts/All%20contacts']"));
        Thread.sleep(2000);
        //AllContacts.click();



        WebElement ContactList = Driver.getDriver().findElement(By.xpath("//div[@id='M2ZkZGZiZGEtZmIyOC00ODEzLTlhOWYtODhjMTJmYzlmOGM2fmNvbnRhY3']"));
        Assert.assertTrue(ContactList.isDisplayed());
        Driver.closeDriver();
    }
    }

/*
5.Story: As a user, I should be able to access to Contacts module.
Test case #3 - verify users can see all the contact names on the contact list
1.Login as a user
2.Click contacts module
3.Verify the contact names are in the list
(Pre-condition: there should be at least 2 contact names are displayed On the contact list)
 */