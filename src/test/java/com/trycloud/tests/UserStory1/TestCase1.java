package com.trycloud.tests.UserStory1;

import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestCase1 {



    @Test
    public void login(){
        String url = ConfigurationReader.getProperty("Url");
        Driver.getDriver().get(url);
        String username = ConfigurationReader.getProperty("userName");
        String password = ConfigurationReader.getProperty("password");
        WebElement userName1 = Driver.getDriver().findElement(By.id("user"));
        userName1.click();
        userName1.sendKeys(username);
        WebElement password1 = Driver.getDriver().findElement(By.id("password"));
        password1.click();
        password1.sendKeys(password);
        Driver.getDriver().findElement(By.id("submit")).click();

    }






}