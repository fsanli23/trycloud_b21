package com.trycloud.tests.UserStory1;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginToWebsite {


    public static void loginTrycloud() {

        //TODO: Setup the driver This code for QA3 website
        String url = ConfigurationReader.getProperty("trycloudUrl");
        Driver.getDriver().get(url);

       // Driver.getDriver().get("http://qa2.trycloud.net/");

        //TODO: Enter Username:
        WebElement inputUserName = Driver.getDriver().findElement(By.id("user"));
        String username = ConfigurationReader.getProperty("userName");
        inputUserName.sendKeys(username); // Username come form configuration/properties

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        // TODO: Enter Password:
        WebElement inputPassword = Driver.getDriver().findElement(By.id("password"));
        String password = ConfigurationReader.getProperty("password");
        inputPassword.sendKeys(password);     // password come from configuration/properties

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        //TODO: Click to login button
        WebElement loginButton = Driver.getDriver().findElement(By.id("submit-form"));
        loginButton.click();

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        //TODO: Verify to Url after, user to login the page
        String actualURL = Driver.getDriver().getCurrentUrl();
        String expectURL = "http://qa2.trycloud.net/index.php/apps/dashboard/";
        Assert.assertNotEquals(actualURL, expectURL);

    }


}
