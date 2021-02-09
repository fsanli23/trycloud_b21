package com.trycloud.tests.user_story_1;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test2 {

    WebDriver driver;

    @Test
    public void test1() {

        //open the crhrome browser
        driver= WebDriverFactory.getDriver("chrome");

        //2- go to  http://qa3.trycloud.net/index.php/login
        driver.get(" http://qa3.trycloud.net/index.php/login");

        //3-maximize the window
        driver.manage().window().maximize();

        //4- implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //5- user able to enter valid username
        WebElement userName= driver.findElement(By.xpath("//input[@id='user']"));
        userName.click();
        userName.sendKeys("User21");

        BrowserUtils.sleep(1);
        // 6. Enter valid username invalid password


        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.click();
        password.sendKeys("Userpass33333");

        BrowserUtils.sleep(1);
        //  7. Click login button

        WebElement loginButton= driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

        BrowserUtils.sleep(1);
        //8. Message “Wrong username or password.” should be displayed

        WebElement wrongPassWarning= driver.findElement(By.xpath("//p[@class='warning wrongPasswordMsg']"));
        Assert.assertTrue(wrongPassWarning.isDisplayed());
        //9. Page title and url should be same


        String actualUrl= driver.getCurrentUrl();
        String expectedUrl= "http://qa3.trycloud.net/index.php/login?user=User21";
        Assert.assertTrue(actualUrl.equals(expectedUrl));
        driver.close();






    }
}
/*Test case #2 - verify user cannot login with invalid credentials

        1. Navigate to login page http://qa2.trycloud.net

        2. Enter valid username invalid password

        3. Click login button

        4. Message “Wrong username or password.” should be displayed

        5. Page title and url should be same  */