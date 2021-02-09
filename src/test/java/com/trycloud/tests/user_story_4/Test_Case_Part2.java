package com.trycloud.tests.user_story_4;

import com.trycloud.tests.user_story_1.LoginToWebsite;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
        BrowserUtils.sleep(2);

        //3.Search a user from search box on the left
        WebElement searchBox = Driver.driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        searchBox.sendKeys("admin"+ Keys.ENTER);
        WebElement selectSearchedContact=Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Conversation, admin'])[1]"));
        selectSearchedContact.click();

        //4.Write a message
        WebElement insertMSGWindow=Driver.getDriver().findElement(By.xpath("//div[@class='new-message-form__advancedinput']"));
        insertMSGWindow.click();
        insertMSGWindow.sendKeys("Hi, I need raise ");
        // 5. Click submit button
        Driver.getDriver().findElement(By.xpath("//button[@type='submit']")).click();
        BrowserUtils.sleep(2);





        // 6.Verify the message is displayed on the conversation log
        WebElement conversation = Driver.driver.findElement(By.xpath("//div[@id='message_1723']"));
        Assert.assertTrue(conversation.isDisplayed());

        Driver.closeDriver();

    }





}
