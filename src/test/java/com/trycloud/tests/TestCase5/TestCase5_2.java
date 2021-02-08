package com.trycloud.tests.TestCase5;

import com.github.javafaker.Faker;
import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestCase5_2 {
    @Test
    public void VerifyUsersCanAddContacts() throws InterruptedException {
        LoginToWebsite.loginTrycloud();

        WebElement Contact = Driver.getDriver().findElement(By.xpath("//a[@aria-label='Contacts']"));
        Thread.sleep(2000);
        Contact.click();

        WebElement NewContactButton = Driver.getDriver().findElement(By.xpath("//div[@class='app-navigation-new']"));
////button[@id='new-contact-button'] ; //div[@class=‘app-navigation-new’]

        NewContactButton.click();
        BrowserUtils.sleep(1);

        Faker faker = new Faker();

        String fullFakeName = faker.name().fullName();
        WebElement fullName = Driver.getDriver().findElement(By.xpath("//input[@id='contact-fullname']"));
        fullName.click();
        fullName.sendKeys(fullFakeName);

        String titleName = faker.job().title();
        WebElement titleNameButton = Driver.getDriver().findElement(By.xpath("//input[@id='contact-title']"));
        titleNameButton.click();
        titleNameButton.sendKeys(titleName);

        String phone = faker.phoneNumber().cellPhone();
        WebElement phoneInsertButton = Driver.getDriver().findElement(By.xpath("//input[@inputmode='tel']"));
        phoneInsertButton.click();
        phoneInsertButton.sendKeys(phone);

        String faker_email = faker.internet().emailAddress();
        WebElement emailInsertButton = Driver.getDriver().findElement(By.xpath("//input[@inputmode='tel']"));
        emailInsertButton.click();
        emailInsertButton.sendKeys(faker_email);

        String address = faker.address().streetAddress();
        WebElement addressButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[11]"));
        addressButton.click();
        addressButton.sendKeys(address);

        String addressExtended = faker.address().secondaryAddress();
        WebElement addressExtendedButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[12]"));
        addressExtendedButton.click();
        addressExtendedButton.sendKeys(addressExtended);

        String postalCode = faker.address().zipCode();
        WebElement postalCodeButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[13]"));
        postalCodeButton.click();
        postalCodeButton.sendKeys(postalCode);

        String cityName = faker.address().city();
        WebElement cityButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[14]"));
        cityButton.click();
        cityButton.sendKeys(cityName);

        String state = faker.address().state();
        WebElement stateButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[15]"));
        stateButton.click();
        stateButton.sendKeys(state);

        String country = faker.address().country();
        WebElement countryButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[16]"));
        countryButton.click();
        countryButton.sendKeys(country);

        List<WebElement> allNames = Driver.getDriver().findElements(By.xpath("//div[@class='vue-recycle-scroller__item-view']"));
        // we need to loop through allNames List of WebElement and make sure expectedName is there
        for (WebElement each : allNames) {
            if (each.getText().equals(fullFakeName)) {
                Assert.assertTrue(each.getText().equals(fullFakeName));
                return;

            }

        }
        Driver.closeDriver();
    }
}
    /*
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

        WebElement NewContactButton = driver.findElement(By.xpath("//div[@class='app-navigation-new']"));
////button[@id='new-contact-button'] ; //div[@class=‘app-navigation-new’]
        // Thread.sleep(5000);
        NewContactButton.click();
        BrowserUtils.sleep(1);

        Faker faker = new Faker();

        String fullFakeName = faker.name().fullName();
        WebElement fullName = Driver.getDriver().findElement(By.xpath("//input[@id='contact-fullname']"));
        fullName.click();
        fullName.sendKeys(fullFakeName);

        String titleName = faker.job().title();
        WebElement titleNameButton = Driver.getDriver().findElement(By.xpath("//input[@id='contact-title']"));
        titleNameButton.click();

        String phone = faker.phoneNumber().cellPhone();
        WebElement phoneInsertButton = Driver.getDriver().findElement(By.xpath("//input[@inputmode='tel']"));
        phoneInsertButton.click();
        phoneInsertButton.sendKeys(phone);

        String faker_email = faker.internet().emailAddress();
        WebElement emailInsertButton = Driver.getDriver().findElement(By.xpath("//input[@inputmode='tel']"));
        emailInsertButton.click();
        emailInsertButton.sendKeys(faker_email);

        String address = faker.address().streetAddress();
        WebElement addressButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[11]"));
        addressButton.click();
        addressButton.sendKeys(address);

        String addressExtended = faker.address().secondaryAddress();
        WebElement addressExtendedButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[12]"));
        addressExtendedButton.click();
        addressExtendedButton.sendKeys(addressExtended);

        String postalCode = faker.address().zipCode();
        WebElement postalCodeButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[13]"));
        postalCodeButton.click();
        postalCodeButton.sendKeys(postalCode);

        String cityName = faker.address().city();
        WebElement cityButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[14]"));
        cityButton.click();
        cityButton.sendKeys(cityName);

        String state = faker.address().state();
        WebElement stateButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[15]"));
        stateButton.click();
        stateButton.sendKeys(state);
        String country = faker.address().country();

        WebElement countryButton = Driver.getDriver().findElement(By.xpath("(//input[@type='text'])[16]"));
        countryButton.click();
        countryButton.sendKeys(country);

        List<WebElement> allNames = Driver.getDriver().findElements(By.xpath("//div[@class='vue-recycle-scroller__item-view']"));
        // we need to loop through allNames List of WebElement and make sure expectedName is there
        for (WebElement each : allNames) {
            if (each.getText().equals(fullFakeName)) {
                Assert.assertTrue(each.getText().equals(fullFakeName));
                return;
            }
        }
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

