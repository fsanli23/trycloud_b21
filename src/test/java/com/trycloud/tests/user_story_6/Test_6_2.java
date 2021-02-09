package com.trycloud.tests.user_story_6;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test_6_2 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        System.out.println("Launching Setup");

        driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://qa3.trycloud.net");

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        System.out.println("SetUp Complete!");

        driver.findElement(By.id("user")).sendKeys("User21");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).click();

        System.out.println("SetUp Complete!");

    }

    @Test
    public void verifyAddBoard(){
        driver.findElement(By.xpath("//a[@href='/index.php/apps/deck/']")).click();
        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@class='app-navigation-toggle']")).click();
        driver.findElement(By.xpath("(//li[@class='app-navigation-entry'])[2]")).click();
        BrowserUtils.sleep(2);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Walid's project"+ Keys.ENTER);

        List<WebElement> list= driver.findElements(By.xpath("//a[@class='app-navigation-entry-link']"));
        for (WebElement each : list) {
            if (each.getText().equals("Walid's project")) {
                Assert.assertTrue(each.getText().equals("Walid's project"));
                return;
            }
        }



    }


    @AfterMethod
    public void teardownMethod(){
        System.out.println("Launching Teardown");
        driver.close();
        System.out.println("Teardown Complete!");

    }

}
/*
6.Story: As a user, I should be able to  access to Notes module.

Test case #2 - verify users can send notes in the page
1.Login as a user
2.Click deck module
3.Click “New Note” button
4.Write a message/Note
5.Verify the note is added on the note list
 */