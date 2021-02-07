package com.trycloud.tests.user_story_3;

import com.google.common.base.Verify;
import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_case_6 {

    @Test
    public void createFolder(){
        LoginToWebsite.loginTrycloud();

        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement FileButton= Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        FileButton.click();
        //2.Click the “+” icon on top
        WebElement newFileButton= Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        newFileButton.click();
        // 3.Click “New Folder”
        WebElement createNewFolderButton= Driver.getDriver().findElement(By.xpath("//a[@data-templatename='New folder']"));
        createNewFolderButton.click();

        WebElement writeNameWindow= Driver.getDriver().findElement(By.xpath("//input[@id='view13-input-folder']"));
        // 4.Write a folder name
        // 5.Click submit icon
        writeNameWindow.sendKeys("Agenda233" + Keys.ENTER);

        // 6.Verify the folder is displayed on the page
        WebElement folderName=Driver.getDriver().findElement(By.xpath("//div[@class='app-sidebar-header__figure app-sidebar-header__figure--with-action']"));
        Assert.assertTrue(folderName.isDisplayed());
        Driver.closeDriver();
    }


}
/*
3.Story: As a user, I should be able to access to Files module.
 Test case #6 - verify users can create a folder
 1.Login as a user
 2.Click the “+” icon on top
 3.Click “New Folder”
 4.Write a folder name
 5.Click submit icon
 6.Verify the folder is displayed on the page
 */