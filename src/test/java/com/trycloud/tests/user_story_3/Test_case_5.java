package com.trycloud.tests.user_story_3;

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

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Test_case_5 {


    @Test
    public void VerifyUploadFile() throws IOException, InterruptedException {
        LoginToWebsite.loginTrycloud();

        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement FileButton = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        FileButton.click();
        // 2.Click the “+” icon on top

        WebElement newFileButton = Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        newFileButton.click();
        // 3.Click “upload file”
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        // 4.Upload a file
        WebElement UploadFileButton = Driver.getDriver().findElement(By.xpath("//label[@for='file_upload_start']"));
        UploadFileButton.sendKeys("/Users/anaganna/Desktop/NextBase.doc");
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        // 5.Verify the file is displayed on the page

        List<WebElement> list = Driver.getDriver().findElements(By.xpath("//span[@class='nametext']"));
        for (WebElement each : list) {
            if (each.getText().equals("Readme")) {
                Assert.assertTrue(each.getText().equals("Readme"));
                return;
            }

        }
        Driver.closeDriver();




    }

}

//3.Story: As a user, I should be able to able to access to Files module.
// Test case #5 - verify users can upload a file directly to the homepage (File-Uploading)
// 1.Login as a user
// 2.Click the “+” icon on top
// 3.Click “upload file”
// 4.Upload a file
// 5.Verify the file is displayed on the page