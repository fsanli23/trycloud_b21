package com.trycloud.tests.TestCase5;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase5_2 {
    @Test
    public void VerifyUsersCanAddContacts() throws InterruptedException {

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

        WebElement NewContactButton  = driver.findElement(By.xpath("//div[@class='app-navigation-new']"));
////button[@id='new-contact-button'] ; //div[@class=‘app-navigation-new’]
        Thread.sleep(5000);
        NewContactButton.click();

        Faker faker = new Faker();

        String fullName = faker.name().fullName();
        String titleName = faker.job().title();
        String phone = faker.phoneNumber().cellPhone();
        String address = faker.address().fullAddress();

       // WebElement ContactList = driver.findElement(By.xpath(""));
      //  Assert.assertTrue(ContactList.isDisplayed());

    }
}
/*
Test case #2 - verify users can add contacts
1.Login as a user
2.Click contacts module
3.Click “New Contact” button
4.Fill out the contact info like : Title, Phone, email, address , etc
5.Verify the contact name is added to the contact list
 */