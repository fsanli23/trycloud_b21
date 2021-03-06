package com.trycloud.tests.user_story_4;

import com.trycloud.tests.user_story_1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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

            WebElement talk_button = Driver.getDriver().findElement(By.xpath(("(//a[@href='http://qa3.trycloud.net/index.php/apps/spreed/'])[1]")));
            talk_button.click();

            // 3.Verify the page tile is Talks module’s title

            String expectedTitle="Talk - Trycloud QA";
            Assert.assertTrue((Driver.getDriver().getTitle()).equals(expectedTitle));


            Driver.closeDriver();

        }


    }

