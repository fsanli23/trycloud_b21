package com.trycloud.tests.UserStory1;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class test1 {

    WebDriver driver;

    @Test
    public void test1() {

        //open the crhrome browser
        driver= WebDriverFactory.getDriver("chrome");

        //2- go to  http://qa.trycloud.net/index.php/login?clear=1
        driver.get("http://qa2.trycloud.net/");

        //3-maximize the window
        driver.manage().window().maximize();

        //4- implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //5- user able to enter valid username
        WebElement userName= driver.findElement(By.xpath("//input[@id='user']"));
        userName.click();
        userName.sendKeys("User21");

        BrowserUtils.sleep(1);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.click();
        password.sendKeys("Userpass123");

        BrowserUtils.sleep(1);

        WebElement loginButton= driver.findElement(By.xpath("//input[@id='submit-form']"));
        loginButton.click();

        BrowserUtils.sleep(1);

        String actualUrl= driver.getCurrentUrl();
        String expectedUrl= "http://qa2.trycloud.net/index.php/login";


    /*    if (actualUrl.equals(expectedUrl)){
            System.out.println("Url verifed");
        }else{
            System.out.println("Url verified Failed");
        }
*/




    }
}

/*Test case #1 =====> verify user login successfully

1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
2. Enter valid username
3. Enter valid password
4. Click login button
5. Verify the URL is chawed to homepage’s url
(Put this test case in testBase class with an annotation so it runs for all the test case)   */