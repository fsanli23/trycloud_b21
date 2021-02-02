package com.trycloud.tests.user_story_3;
//Story: As a user, I should be able to access to Files module.
        //Test case #8 - verify users can write comments to files/folders.
//1. Login as a user
//2. Click action-icon from any file on the page
//3. Click details
//4. Write a comment inside to the input box
//5. Click the submit button to post it
//6. Verify the comment is displayed in the comment section.
        //(Pre-condition: there should be at least 1 file/foler is uploaded inside files page)

import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_case_8_part_2 {

    WebDriver driver;

    @Test(description =  "user should able to login")
    public void test_1(){

        // call login class

    }


    @Test(description = "User can write comments to files/folders")
    public void test_2(){

        //2. Click action-icon from any file on the page
        WebElement action_icon = driver.findElement(By.xpath("(//a[@class='action action-menu permanent'])[1]"));
        action_icon.click();

        BrowserUtils.sleep(1);

        //3. Click details
        WebElement details_Button = driver.findElement(By.xpath("//a[@class='menuitem action action-details permanent']"));
        details_Button.click();

        BrowserUtils.sleep(1);

        //4. Write a comment inside to the input box
        WebElement comment_button = driver.findElement(By.xpath("//a[@id='commentsTabView']"));
        comment_button.click();

        BrowserUtils.sleep(1);

        WebElement comment_line = driver.findElement(By.xpath("//div[@class='message']"));
        comment_line.click();
        comment_line.sendKeys("This is my first commit");


        //5. Click the submit button to post it
        WebElement submit_button = driver.findElement(By.xpath("//input[@class='submit icon-confirm has-tooltip']"));
        submit_button.click();

        //6. Verify the comment is displayed in the comment section.

        WebElement actualComment = driver.findElement(By.xpath("(//div[@class='message'])[2]"));

        String actualText = actualComment.getText();
        String expectText = "This is my first commit";

        Assert.assertTrue(actualText.equals(expectText));



    }



}
