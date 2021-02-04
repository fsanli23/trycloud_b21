package com.trycloud.tests.user_story_3;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_case_1 {
WebDriver driver;
    @Test
    public void logIn() {//log-in trycloud
        LoginToWebsite.loginTrycloud();
    }

    @Test
    public void verifyTitle() {//confirming

        Assert.assertTrue(driver.getTitle().contains("Dashboard - Trycloud QA"));
    }

}
