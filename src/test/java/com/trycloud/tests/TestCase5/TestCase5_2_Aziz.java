package com.trycloud.tests.TestCase5;

import com.github.javafaker.Faker;
import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase5_2_Aziz {

    @Test(description = " verify users can add contacts ")
    public void AddContacts() {

        // TODO: User can Login to website successfully
        LoginToWebsite.loginTrycloud();
        BrowserUtils.sleep(1);

        //TODO: Click contacts module on the top menu
        WebElement contactsModule = Driver.driver.findElement(By.xpath("(//a[@href='/index.php/apps/contacts/'])[1]"));
        contactsModule.click();
        BrowserUtils.sleep(1);

        //TODO: Click “New Contact” button
        WebElement newContactButton = Driver.getDriver().findElement(By.xpath("//div[@class='app-navigation-new']"));   //   ------//div[@class='app-navigation-new'] ----   //button[@id='new-contact-button']
        newContactButton.click();
        BrowserUtils.sleep(2);


        //TODO: Fill out the contact info like : Title, Phone, email, address , etc ( you can call all information from faker )
        Faker faker = new Faker();
        String faker_fullname = faker.name().fullName();
        String faker_phone = faker.phoneNumber().cellPhone();
        String faker_email = faker.internet().emailAddress();
        String faker_postBox = faker.address().zipCode();
        String faker_address = faker.address().streetAddress();
        String faker_city = faker.address().cityName();
        String faker_state = faker.address().state();
        String faker_country = faker.address().country();


        // TODO: Fill up the full name of contact
        WebElement fullnameContact = Driver.getDriver().findElement(By.xpath("//input[@id='contact-fullname']"));
        fullnameContact.click();
        fullnameContact.sendKeys(faker_fullname);
        BrowserUtils.sleep(1);

        //TODO: fill up the phone number of contact
        WebElement phoneContact = Driver.getDriver().findElement(By.xpath("//input[@inputmode='tel']"));   // --- //input[@class='property__value property__value--with-ext']
        phoneContact.click();
        phoneContact.sendKeys(faker_phone);
        BrowserUtils.sleep(1);

        //TODO: fill up the email of contact
        WebElement emailContact = Driver.getDriver().findElement(By.xpath("//input[@inputmode='email']"));       //--- (//input[@class="property__value"])[1]  --- (//input[@class='property__value'])[2]
        emailContact.click();
        emailContact.sendKeys(faker_email);
        BrowserUtils.sleep(1);


        //TODO: Refresh the page
        Driver.getDriver().navigate().to(Driver.getDriver().getCurrentUrl());


        BrowserUtils.sleep(3);
        Driver.closeDriver();


    }
}
//Test case #2 - verify users can add contacts
//        1.Login as a user
//        2.Click contacts module
//        3.Click “New Contact” button
//        4.Fill out the contact info like : Title, Phone, email, address , etc
//        5.Verify the contact name is added to the contact list


/*
//
//        //TODO: fill up the postOfficeBox
//        WebElement postBox = Driver.driver.findElement(By.xpath("(//input[@class='property__value'])[3]"));
//        postBox.click();
//        postBox.sendKeys();
//        BrowserUtils.sleep(1);


        //TODO: Fill up the address
        WebElement address = Driver.getDriver().findElement(By.xpath("(//input[@class='property__value'])[4]"));
        address.click();
        address.sendKeys(faker_address);
        BrowserUtils.sleep(1);


        //TODO: Fill up the City name
        WebElement cityName = Driver.getDriver().findElement(By.xpath("(//input[@class='property__value'])[7]"));
        cityName.click();
        cityName.sendKeys(faker_city);
        BrowserUtils.sleep(1);


        //TODO: Fill The state name
        WebElement stateName = Driver.getDriver().findElement(By.xpath("(//input[@class='property__value'])[8]"));
        stateName.click();
        stateName.sendKeys(faker_state);
        BrowserUtils.sleep(1);


        //TODO: Fill up the country name
        WebElement countryName = Driver.getDriver().findElement(By.xpath("(//input[@class='property__value'])[9]"));
        countryName.click();
        countryName.sendKeys(faker_country);
 */