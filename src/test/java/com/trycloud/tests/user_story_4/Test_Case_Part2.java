package com.trycloud.tests.user_story_4;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.tests.UserStory1.TestCase1;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Case_Part2 {

    /*
  Test case #2 - verify users can send message
  1.Login as a user
  2.Click Talks module
  3.Search a user from search box on the left
  4.Write a message
  5.Click submit button
  6.Verify the message is displayed on the conversation log
   */



    @Test
    public void test_2(){

        LoginToWebsite.loginTrycloud();

        //  2.Click Talks module
         WebElement talk_button = Driver.driver.findElement(By.xpath(("//a[@href='http://qa3.trycloud.net/index.php/apps/spreed/'][1]")));
        talk_button.click();

        //3.Search a user from search box on the left
        WebElement searchBox = Driver.driver.findElement(By.xpath("(//input)[16]"));
        searchBox.click();

        //4.Write a message
        String searchValue = "Glbhr";
        searchBox.sendKeys(searchValue + Keys.ENTER);

        //5.Click submit button
        searchBox.submit();

        //5.Click submit button
       // WebElement SubmitButton = driver.findElement(By.name(""));
       // SubmitButton.click();

        // 6.Verify the message is displayed on the conversation log
        WebElement conversation = Driver.driver.findElement(By.xpath(("(//div)[126]")));
        conversation.click();

    }





}
