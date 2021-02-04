package com.trycloud.tests.user_story_3;

import com.google.common.base.Verify;
import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_case_7 {

    @Test
    public void creatingFileInsideFolder(){
        LoginToWebsite.loginTrycloud();

        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        //2.Choose a folder from the page
        WebElement FileButton= Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        FileButton.click();
        Actions actions=new Actions(Driver.getDriver());


        WebElement folderOnHomepage= Driver.getDriver().findElement(By.xpath("//span[@class='innernametext']"));
        actions.doubleClick(folderOnHomepage);
        //3.Click the “+” icon on top
        WebElement plusButton= Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        //4.Click “upload file”
        plusButton.click();
        //5.Upload a file
        WebElement uploadButton= Driver.getDriver().findElement(By.xpath("//label[@for='file_upload_start']"));
        uploadButton.sendKeys("/Users/anaganna/Desktop/Screen Shot 2021-02-04 at 10.40.23 AM.png");
        //6.Verify the file is displayed on the page



    }
}
/*

(Pre-condition: there should be at least 1 folder is created on the filers pag
 */