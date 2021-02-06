package com.trycloud.tests.user_story_3;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_case_3 {

//Test case #3 - verify users can add a file to favorites.
//1. Login as a user
//2. Click action-icon from any file on the page
//3. Choose “Add to Favorites” option
//4. Click “Favorites” sub-module on the lest side
//5. Verify the chosen file is listed on the table
//(Pre-condition: there should be at least 1 file is uploaded)

    @Test
    public void verifyFavorites(){
        LoginToWebsite.loginTrycloud();
        Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]")).click();

    }

















}
