package com.trycloud.tests.user_story_3;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_case_2 {
WebDriver driver;
    @Test
    public void login(){
        LoginToWebsite.loginTrycloud();
    }


}






