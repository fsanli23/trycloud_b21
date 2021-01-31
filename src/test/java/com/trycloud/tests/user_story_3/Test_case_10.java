package com.trycloud.tests.user_story_3;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

//Test case #10 - verify users see the app storage usage
//1. Login as a user
//2. Check the current storage usage
//3. Upload a file
//4. Refresh the page
//5. Verify the storage usage is increased
public class Test_case_10 {

    WebDriver driver;

    @Test(description = "User able to Login website")
    public void test_1(){

        // call login class

    }


    @Test(description = "User can see tje app storege usage")
    public void test_2(){

        //2. Check the current storage usage
        WebElement storageUsage = driver.findElement(By.xpath("//a[@class='icon-quota svg']/p"));
        System.out.println(storageUsage.getText());

        WebElement uploadAFile = driver.findElement(By.xpath("//span[@class='icon icon-add']"));
        uploadAFile.click();

        WebElement newTextDocument = driver.findElement(By.xpath("(//span[@class='displayname'])[3]"));
        newTextDocument.click();

        WebElement textDocumentName = driver.findElement(By.xpath("(//input[@id='view13-input-file'])"));
        textDocumentName.clear();
        textDocumentName.sendKeys("Faker Story.md");

        WebElement iconConfirm = driver.findElement(By.xpath("(//input[@class='icon-confirm'])"));
        iconConfirm.click();

        WebElement story = driver.findElement(By.xpath("//div[@class='ProseMirror']"));
        story.click();

        Faker faker = new Faker();
        String fakerStory = faker.shakespeare().hamletQuote();
        story.sendKeys(fakerStory);

        WebElement closeIcon = driver.findElement(By.xpath("(//button[@rel='noreferrer noopener'])[1]"));
        closeIcon.click();

        WebElement storageUsage2 = driver.findElement(By.xpath("//a[@class='icon-quota svg']/p"));
        System.out.println(storageUsage2.getText());






    }

}
