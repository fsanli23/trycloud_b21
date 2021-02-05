package com.trycloud.tests.TestCase5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase5_3 {

    @Test
    public void VerifyContactList() throws InterruptedException {

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

        WebElement Contact = driver.findElement(By.xpath("//a[@aria-label='Contacts']"));
        Thread.sleep(2000);
        Contact.click();

        WebElement AllContacts = driver.findElement(By.xpath("//a[@href='/index.php/apps/contacts/All%20contacts']"));
        Thread.sleep(2000);
        AllContacts.click();

        // WebElement ContactList = driver.findElement(By.xpath(""));
        //  Assert.assertTrue(ContactList.isDisplayed());


    }
}
/*
5.Story: As a user, I should be able to access to Contacts module.
Test case #3 - verify users can see all the contact names on the contact list
1.Login as a user
2.Click contacts module
3.Verify the contact names are in the list
(Pre-condition: there should be at least 2 contact names are displayed On the contact list)
 */