package com.trycloud.tests.user_story_3;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_case_1 {

    @Test
    public void verfyTitle() {//log-in trycloud and comparing actual title with expected title
        LoginToWebsite.loginTrycloud();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard - Trycloud QA"));
    }


}
