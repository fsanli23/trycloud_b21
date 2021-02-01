package com.trycloud.tests.UserStory1;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1 {

    WebDriver driver;

    @BeforeMethod


    public void setupMethod() {

        System.out.println("Launching Setup");
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
        driver.manage().window().maximize();
        //    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("SetUp Complete!");

///
//
    }
@Test
    public void loginPage(){

    driver.findElement(By.id("user")).sendKeys("User21");
    driver.findElement(By.id("password")).sendKeys("Userpass123");
    driver.findElement(By.id("submit-wrapper")).click();

}

}
/*Test case #1 - verify user login successfully
1. Navigate to login page http://qa.trycloud.net/index.php/login?clear=1
2. Enter valid username
3. Enter valid password
4. Click login button
5. Verify the URL is chawed to homepage’s url
(Put this test case in testBase class with an annotation so it runs for all the test case)*/