package com.trycloud.tests.user_story_3;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class seconTestcase_10 {

    @Test(description = "Uploading any file from computer")
    public void uploadFile() throws AWTException {

        // User Login the website
        LoginToWebsite.loginTrycloud();
        BrowserUtils.sleep(2);

        //User click to file module
        WebElement fileModule = Driver.getDriver().findElement(By.xpath("(//li[@data-id='files'])[1]"));
        fileModule.click();
        BrowserUtils.sleep(1);

        // use click the add icon
        WebElement addIcon = Driver.getDriver().findElement(By.xpath("//span[@class='icon icon-add']"));
        addIcon.click();
        BrowserUtils.sleep(1);

        //user choose the upload file
        WebElement uploadFile = Driver.getDriver().findElement(By.xpath("//label[@for='file_upload_start']"));
        uploadFile.click();
        BrowserUtils.sleep(1);

        // created a object for the upload a file from computer
        File file = new File("/Users/abdulazizozden/Downloads/bibliotheque_nationale_de_france-wallpaper-3840x2160.jpg");
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());

        // upload section is created with label for that we need to call robot object. ====>> if upload option created with input you don't need to robot.
        Robot robot = new Robot();

        // Cmd + Tab is needed since it launches a Java app and the browser looses focus
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(1000);
        //Open Goto window
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
        //Paste the clipboard value
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
        //Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        //Driver.getDriver().navigate().refresh();

        BrowserUtils.sleep(2);
        //Driver.closeDriver();
    }


/*


    @Test(description = "verify users see the app storage usage")
    public void storageUsage() throws InterruptedException, AWTException {
        //TODO: Login as a user
       // driver.get("http://qa.trycloud.net/index.php/apps/files/?dir=/&fileid=393");
        LoginUtil.Login(driver,"userName1","password");
        WebElement fileModule = driver.findElement(By.xpath("(//li[@data-id='files'])[1]"));
        fileModule.click();
        //TODO: Click the File icon on the top modules
        // 3.Upload a file
        driver.findElement(By.xpath("//span[@class='icon icon-add']")).click();
        //BrowserUtils.sleep(3);
        WebElement uploadFile = driver.findElement(By.xpath("//label[@for='file_upload_start']"));
        uploadFile.click();
        File file = new File("paste path way");
        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        //Copy to clipboard
        Robot robot = new Robot();
// Cmd + Tab is needed since it launches a Java app and the browser looses focus
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(500);
//Open Goto window
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
//Paste the clipboard value
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);
//Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);


     //   driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
 */
     //   driver.navigate().refresh();
        /*Faker faker = new Faker();
        WebElement chooseFile = Driver.getDriver().findElement(By.xpath("//a[@class='button new']"));
        chooseFile.click();
        BrowserUtils.sleep(1);
        WebElement newTextDocumentButton = Driver.getDriver().findElement(By.xpath("//span[@class='icon icon-filetype-text svg']"));
        newTextDocumentButton.click();
        BrowserUtils.sleep(1);
        WebElement fileName = Driver.getDriver().findElement(By.xpath("//input[@id='view13-input-file']"));
        String fileName2 = faker.name().name();
        fileName.sendKeys(fileName2 );
        BrowserUtils.sleep(1);
        WebElement submitButton = Driver.getDriver().findElement(By.xpath("//input[@class='icon-confirm']"));
        submitButton.click();
        BrowserUtils.sleep(1);
        String theatre = faker.gameOfThrones().quote();
        WebElement writeText = Driver.getDriver().findElement(By.xpath("(//p[@class='is-empty is-editor-empty'])[2]"));
        writeText.click();
        writeText.sendKeys(theatre);
        BrowserUtils.sleep(1);
        WebElement closeIcon = Driver.getDriver().findElement(By.xpath("//div[@class='icons-menu']"));
        closeIcon.click();
        BrowserUtils.sleep(1); */
    /*
        //TODO: Refresh the page
        driver.navigate().to(driver.getCurrentUrl());
        BrowserUtils.sleep(1);
        //TODO: Verify the storage usage is increased
        String actualStorage = "";
        String expectStorage = "";
        Assert.assertEquals(actualStorage,expectStorage);
        BrowserUtils.sleep(3);
        //Driver.closeDriver();
     */
}
