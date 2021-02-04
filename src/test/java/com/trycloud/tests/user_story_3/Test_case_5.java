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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Test_case_5 {


    @Test
    public void VerifyUploadFile() throws IOException, InterruptedException {
        LoginToWebsite.loginTrycloud();

        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement FileButton= Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        FileButton.click();
        // 2.Click the “+” icon on top
        String pathFile="/Users/anaganna/Desktop/Screen Shot 2021-02-04 at 7.58.09 AM.png";
        WebElement newFileButton=Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        newFileButton.click();
        // 3.Click “upload file”
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       WebElement UploadFileButton= Driver.getDriver().findElement(By.xpath("//label[@for='file_upload_start']"));

        // 4.Upload a file
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);



         UploadFileButton.sendKeys(pathFile+ Keys.ENTER);

        // 5.Verify the file is displayed on the page


/*
 List<WebElement> allNames= driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//tr//td[2]"));
        // we need to loop through allNames List of WebElement and make sure expectedName is there
        for (WebElement each : allNames) {
            if(each.getText().equals(expectedName)) {
                Assert.assertTrue(each.getText().equals(expectedName));
                return;
            }
        }

 */
       // WebElement fileNameOnWeb= Driver.getDriver().findElement(By.xpath("(//span[@class='nametext'])[6]"));

      // Assert.assertTrue(fileNameOnWeb.isDisplayed());




    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
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