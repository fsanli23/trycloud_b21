package com.trycloud.tests.user_story_3;
//Story: As a user, I should be able to access to Files module.
//Test case #9 - verify users can change the app Settings.
//1. Login as a user
//2. Click Settings on the left bottom corner
//3. Verify user can click any buttons.

import com.google.common.base.Verify;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_case_9 {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        System.out.println("Launching Setup");
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
        driver.manage().window().maximize();
        //    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("SetUp Complete!");

        driver.findElement(By.id("user")).

        sendKeys("User21");
        driver.findElement(By.id("password")).

        sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).

        click();

}

    @Test(description = "User can change the app setting")
    public void test_2() {


        //2. Click Settings on the left bottom corner
        WebElement settings_button = driver.findElement(By.xpath("//button[@class= 'settings-button']"));
        settings_button.click();

        BrowserUtils.sleep(1);

        //3. Verify user can click any buttons.
        WebElement richWorkspaces = driver.findElement(By.xpath("//input[@id='showRichWorkspacesToggle']"));
        richWorkspaces.click();

        BrowserUtils.sleep(1);

        WebElement recommendations = driver.findElement(By.xpath("//input[@id='recommendationsEnabledToggle']"));
        recommendations.click();

        BrowserUtils.sleep(1);

        WebElement hiddenfiles = driver.findElement(By.xpath("//input[@id='showhiddenfilesToggle']"));
        hiddenfiles.click();

//        // Verify to Clicked all buttons.
//        System.out.println(settings_button.isDisplayed());
//        System.out.println(richWorkspaces.isDisplayed());
//        System.out.println(recommendations.isDisplayed());
//        System.out.println(hiddenfiles.isDisplayed());

    }


}
