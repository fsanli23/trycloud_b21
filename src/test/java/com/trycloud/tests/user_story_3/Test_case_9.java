package com.trycloud.tests.user_story_3;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_case_9 {

    /*
    Test case #9 - verify users can change the app Settings.
        1. Login as a user
        2. Click Settings on the left bottom corner
        3. Verify user can click any buttons.
     */

    @Test (description = "Verify users can change the app Settings")
    public void settingFunctionality(){

        //TODO: Login as a user
        LoginToWebsite.loginTrycloud();
        BrowserUtils.sleep(3);


        //TODO: Click the File icon on the top modules
        WebElement fileIcon = Driver.getDriver().findElement(By.xpath("(//a[@href='/index.php/apps/files/'])[1]"));
        fileIcon.click();
        BrowserUtils.sleep(2);


        //TODO: Click Settings on the left bottom corner
        WebElement settingButton = Driver.getDriver().findElement(By.xpath("//button[@class='settings-button']"));
        settingButton.click();
        BrowserUtils.sleep(2);

        WebElement richWorkspaces = Driver.getDriver().findElement(By.xpath("//label[@for='showRichWorkspacesToggle']"));
        richWorkspaces.click();
        BrowserUtils.sleep(2);

        WebElement recommendations = Driver.getDriver().findElement(By.xpath("//label[@for='recommendationsEnabledToggle']"));
        recommendations.click();
        BrowserUtils.sleep(2);

        WebElement hiddenFiles = Driver.getDriver().findElement(By.xpath("//label[@for='showhiddenfilesToggle']"));
        hiddenFiles.click();
        BrowserUtils.sleep(2);


        //TODO: Verify user can click any buttons.
        if(richWorkspaces.isDisplayed() && recommendations.isDisplayed() && hiddenFiles.isDisplayed()) {
            System.out.println("All check box is displayed, PASS!");
        }else{
            System.out.println("All check box is displayed, FAILED!!!");
        }

        BrowserUtils.sleep(3);
        Driver.closeDriver();
    }

}
