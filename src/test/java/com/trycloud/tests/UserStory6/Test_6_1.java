package com.trycloud.tests.UserStory6;

import com.google.gson.internal.bind.util.ISO8601Utils;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_6_1 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        System.out.println("Launching Setup");

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");

        driver.findElement(By.id("user")).sendKeys("User21");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).click();

        System.out.println("SetUp Complete!");
    }


    @Test
    public void test1_verifyNotes() {


        driver.findElement(By.xpath("//a[@href='/index.php/apps/notes/']")).click();


        String actualTitle = driver.getTitle();
        String expectedTitle = ("Notes - Trycloud - QA");
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title Page Confirmed!");
        } else {
            System.err.println("Title Confirmation Failure!");
            System.err.println("Actual Title: " + driver.getTitle());
        }


    }


 @AfterMethod
    public void teardownMethod() {
        System.out.println("Launching Teardown");
        driver.close();
        System.out.println("Teardown Complete!");

    }




}
