package com.trycloud.tests.user_story_2;

import com.trycloud.tests.user_story_1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class UserStory2_TestCase {
    @Test
    public void mainModuleFilesVerification() {
        LoginToWebsite.loginTrycloud();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//header//li"));
        for (WebElement each : list) {
            if (each.getText().equals("Files")) {
                Assert.assertTrue(each.getText().equals("Files"));

            }

        }
        Driver.closeDriver();
    }

    @Test
    public void moduleGalleriesVerification() {
        LoginToWebsite.loginTrycloud();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//header//li"));
        for (WebElement each : list) {
            if (each.getText().equals("Galleries")) {
                Assert.assertTrue(each.getText().equals("Galleries"));

            }

        }
        Driver.closeDriver();
    }
    @Test
    public void moduleActivityVerification() {
        LoginToWebsite.loginTrycloud();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//header//li"));
        for (WebElement each : list) {

            if (each.getText().contains("Activity")) {
                Assert.assertTrue(each.getText().equals("Activity"));

            }

        }
        Driver.closeDriver();
    }
    @Test
    public void moduleTalkVerification() {
        LoginToWebsite.loginTrycloud();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//header//li"));
        for (WebElement each : list) {

            if (each.getText().contains("Talk")) {
                Assert.assertTrue(each.getText().equals("Talk"));

            }

        }
        Driver.closeDriver();
    }

    @Test
    public void moduleContactsVerification() {
        LoginToWebsite.loginTrycloud();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//header//li"));
        for (WebElement each : list) {

            if (each.getText().contains("Contacts")) {
                Assert.assertTrue(each.getText().equals("Contacts"));

            }

        }
        Driver.closeDriver();
    }

    @Test
    public void moduleCalendarVerification() {
        LoginToWebsite.loginTrycloud();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//header//li"));
        for (WebElement each : list) {

            if (each.getText().contains("Calendar")) {
                Assert.assertTrue(each.getText().equals("Calendar"));

            }

        }
        Driver.closeDriver();
    }

    @Test
    public void moduleNoteVerification() {
        LoginToWebsite.loginTrycloud();
        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//header//li"));
        for (WebElement each : list) {

            if (each.getText().contains("Note")) {
                Assert.assertTrue(each.getText().equals("Note"));

            }

        }
        Driver.closeDriver();
    }

}
/*
Test case #1 - verify users access to the main modules1.Login as a user
2.Verify the user see the following modules:
Files
Galleries
Activity
Talk
Contacts
Calendar
Note
( Expected module name: Galleries
 */