package com.trycloud.tests.TestCase5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase5_1 {

    @Test
    public void AccessToContactsModule() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa3.trycloud.net/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='user']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement login = driver.findElement(By.xpath("//input[@class='login primary']"));

        username.sendKeys("User21");
        password.sendKeys("Userpass123");

        login.click();

        //3- Click to Contacts
        //To be able to click, we need to locate the web element from the page
        driver.findElement(By.xpath("//a[@aria-label='Contacts']")).click();
        //4- Verify title contains:
        //Expected: Contacts
        String expectedInTitle = "Contacts";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedInTitle)) {
            System.out.println("Title verification PASSED!");
        } else {
            System.err.println("Title verification FAILED!!!");
        }
        driver.close();
    }

}

/*
5.Story: As a user, I should be able to access to Contacts module.
Test case #1 - verify users can access to Contact module
1.Login as a user.
2.Click “Contacts” module.
3.Verify the page title is Contents module’s title.
 */







