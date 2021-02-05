package com.trycloud.tests.UserStory6;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_6_2 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        System.out.println("Launching Setup");

        driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://qa.trycloud.net/index.php/login?clear=1");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        System.out.println("SetUp Complete!");

        driver.findElement(By.id("user")).sendKeys("User21");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).click();

        System.out.println("SetUp Complete!");

    }

    @Test
    public void verifyNotes(){

    }


    @AfterMethod
    public void teardownMethod() {
        System.out.println("Launching Teardown");
        driver.close();
        System.out.println("Teardown Complete!");

    }

}
