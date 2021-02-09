package com.trycloud.tests.user_story_6;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
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
        driver.get("http://qa3.trycloud.net");

        driver.findElement(By.id("user")).sendKeys("User21");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).click();

        System.out.println("SetUp Complete!");
    }


    @Test
    public void test1_verifyNotes() {


        driver.findElement(By.xpath("//a[@href='/index.php/apps/deck/']")).click();



        String actualTitle = driver.getTitle();
        String expectedTitle = ("Deck - Trycloud - QA");
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
/*
6.Story: As a user, I should be able to  access to Notes module.
Test case #1 - verify users can access to Talks module
1.Login as a user
2.Click “Notes” module
3.Verify the page tile/URL is Notes module’s tile
 */