package com.trycloud.tests.user_story_3;

import com.trycloud.tests.user_story_1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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



        WebElement folderOnHomepage= Driver.getDriver().findElement(By.xpath("//a[@href='/index.php/apps/files?dir=//Talk']"));
        folderOnHomepage.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //3.Click the “+” icon on top
       WebElement plusButton= Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        //4.Click “upload file”
        plusButton.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //5.Upload a file
        WebElement uploadButton= Driver.getDriver().findElement(By.xpath("//input[@type='file']"));
        uploadButton.sendKeys("/Users/anaganna/Desktop/Screen Shot 2021-01-31 at 10.41.45 PM.png");
        Driver.getDriver().manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        //6.Verify the file is displayed on the page
        WebElement file=Driver.getDriver().findElement(By.xpath("(//span[@class='innernametext'])[1]"));
        Assert.assertTrue(file.isDisplayed());

        Driver.getDriver().manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        Driver.closeDriver();

        }











    }

/*

(Pre-condition: there should be at least 1 folder is created on the filers pag
 */