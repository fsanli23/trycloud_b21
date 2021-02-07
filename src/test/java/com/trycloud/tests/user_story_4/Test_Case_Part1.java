package com.trycloud.tests.user_story_4;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.tests.UserStory1.TestCase1;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Case_Part1 {

    /*
    Test case #1 - verify users can access to Talks module
     1.Login as a user
     2.Click Talks module
     3.Verify the page title is Talks module’s title
     */




        @Test
        public void test_2() {
            //  2.Click Talks module

            LoginToWebsite.loginTrycloud();

            WebElement talk_button = Driver.getDriver().findElement(By.xpath(("//a[@href='http://qa.trycloud.net/index.php/apps/spreed/'])[1]")));
            talk_button.click();

            // 3.Verify the page tile is Talks module’s title
            WebElement PageTitle = Driver.getDriver().findElement(By.xpath(("(//span)[15]")));
            PageTitle.click();

        }


    }

