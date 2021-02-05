package com.trycloud.tests.user_story_3;

import com.github.javafaker.Faker;
import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_case_10 {

    /*
        Test case #10 - verify users see the app storage usage
            1. Login as a user
            2. Check the current storage usage
            3. Upload a file
            4. Refresh the page
            5. Verify the storage usage is increased
     */
    @Test(description = "verify users see the app storage usage")
    public void storageUsage() {

        //TODO: Login as a user
        LoginToWebsite.loginTrycloud();
        BrowserUtils.sleep(3);

        //TODO: Click the File icon on the top modules
        WebElement fileIcon = Driver.getDriver().findElement(By.xpath("(//a[@href='/index.php/apps/files/'])[1]"));
        fileIcon.click();
        BrowserUtils.sleep(2);


        //TODO: Check the current storage usage
        WebElement beforeUploadStorage = Driver.getDriver().findElement(By.xpath("//a[@class='icon-quota svg']"));
        beforeUploadStorage.getText();
        //System.out.println("Storage usage, before upload a file: " + beforeUploadStorage.getText());
        BrowserUtils.sleep(2);

        //TODO: upload a file
/*        String path = "/Users/abdulazizozden/Downloads/NextBase.xlsx";
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        chooseFile.click();
        BrowserUtils.sleep(1);
        WebElement uploadButton = Driver.getDriver().findElement(By.xpath("//span[@class='svg icon icon-upload']"));
        uploadButton.click();
        BrowserUtils.sleep(1);
        chooseFile.sendKeys(path);*/


        Faker faker = new Faker();

        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        chooseFile.click();

        BrowserUtils.sleep(2);

        WebElement newTextDocumentButton = Driver.getDriver().findElement(By.xpath("//span[@class='icon icon-filetype-text svg']"));
        newTextDocumentButton.click();

        BrowserUtils.sleep(2);

        WebElement fileName = Driver.getDriver().findElement(By.xpath("//input[@id='view13-input-file']"));
        String fileName2 = faker.name().name();
        fileName.sendKeys(fileName2 );

        BrowserUtils.sleep(2);

        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//input[@class='icon-confirm']"));
        submitButton.click();

        BrowserUtils.sleep(2);

        String theatre = faker.gameOfThrones().house();
        WebElement writeText = Driver.getDriver().findElement(By.xpath("(//p[@class='is-empty is-editor-empty'])[2]"));
        writeText.click();
        writeText.sendKeys(theatre);

        BrowserUtils.sleep(2);

        WebElement closeIcon = Driver.getDriver().findElement(By.xpath("//div[@class='icons-menu']"));
        closeIcon.click();

        BrowserUtils.sleep(2);

        //TODO: Refresh the page
        Driver.getDriver().navigate().to(Driver.getDriver().getCurrentUrl());



        BrowserUtils.sleep(2);

        //TODO: Verify the storage usage is increased
        String actualStorage = "";
        String expectStorage = "";

        Assert.assertEquals(actualStorage,expectStorage);



        Driver.closeDriver();
    }
}
