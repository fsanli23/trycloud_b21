package com.trycloud.tests.user_story_3;

import com.github.javafaker.Faker;
import com.google.common.base.Verify;
import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_case_8 {


    /*
        3. Story: As a user, I should be able to access to Files module.
        Test case #8 - verify users can delete a file/folder.
        1. Login as a user
        2. Click action-icon from any file on the page
        3. Choose “delete files” option
        4. Click deleted files on the left bottom corner
        5. Verify the deleted file is displayed no the page.
        (Pre-condition: there should be at least 1 file is uploaded inside files page)
 */
    @Test(description = "User can delete some Files")
    public void DeleteFile() {

        LoginToWebsite.loginTrycloud();

        //TODO: Click the File icon on the top modules
        WebElement fileIcon = Driver.getDriver().findElement(By.xpath("(//a[@href='/index.php/apps/files/'])[1]"));
        fileIcon.click();
        BrowserUtils.sleep(2);


        //TODO: Click action-icon from any file on the page
        WebElement actionIcon = Driver.getDriver().findElement(By.xpath("(//span[@class='icon icon-more'])[2]"));
        actionIcon.click();
        BrowserUtils.sleep(2);


        //TODO: Choose "delete files" option
        WebElement deleteFile = Driver.getDriver().findElement(By.xpath("(//span[@class='icon icon-delete'])[2]"));
        deleteFile.click();
        BrowserUtils.sleep(2);


        //TODO: Click deleted files on the left bottom corner
        WebElement deleteButton = Driver.getDriver().findElement(By.xpath("//a[@class='nav-icon-trashbin svg']"));
        deleteButton.click();
        BrowserUtils.sleep(2);


        //TODO: Verify the deleted file is displayed no the page.

        WebElement fileName = Driver.getDriver().findElement(By.xpath("//span[.='barron_gorge_river_cairns_australia-wallpaper-2560x1440']"));
        Assert.assertTrue(!fileName.isDisplayed());

        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }


    /*
    Test case #8 - verify users can write comments to files/folders.
    1. Login as a user
    2. Click action-icon from any file on the page
    3. Click details
    4. Write a comment inside to the input box
    5. Click the submit button to post it
    6. Verify the comment is displayed in the comment section.
    (Pre-condition: there should be at least 1 file/folder is uploaded inside files page)
     */

    @Test(description = "User can see details of file and can add comment")
    public void detailsFile(){

        //TODO: User able to login
        LoginToWebsite.loginTrycloud();

        //TODO: Click the File icon on the top modules
        WebElement fileIcon = Driver.getDriver().findElement(By.xpath("(//a[@href='/index.php/apps/files/'])[1]"));
        fileIcon.click();
        BrowserUtils.sleep(2);


        //TODO: Click action-icon from any file on the page
        WebElement actionIcon = Driver.getDriver().findElement(By.xpath("(//span[@class='icon icon-more'])[2]"));
        actionIcon.click();
        BrowserUtils.sleep(2);


        //TODO: User able to choose "details" option
        WebElement detailsButton = Driver.getDriver().findElement(By.xpath("//span[@class='icon icon-details']"));
        detailsButton.click();
        BrowserUtils.sleep(2);


        //TODO: Click the comment Button
        WebElement commentButton = Driver.getDriver().findElement(By.xpath("//a[@id='commentsTabView']"));
        commentButton.click();
        BrowserUtils.sleep(2);

        //TODO:Write a comment inside to the input box
        WebElement sendMessage = Driver.getDriver().findElement(By.xpath("//div[@class='message']"));
        sendMessage.click();
//        Faker faker = new Faker();
//        String comment = faker.gameOfThrones().city();
//        BrowserUtils.sleep(1);
        //TODO:Click the submit button to post it
        sendMessage.sendKeys("I love you" + Keys.ENTER);
        BrowserUtils.sleep(2);


        //TODO:Verify the comment is displayed in the comment section.
        WebElement verifyComment = Driver.getDriver().findElement(By.xpath("(//div[@class='message'])[2]"));
        String actualComment = verifyComment.getText();
        String expectComment = "I love you";
        Assert.assertEquals(actualComment, expectComment);

    }

}