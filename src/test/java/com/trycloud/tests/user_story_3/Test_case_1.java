package com.trycloud.tests.user_story_3;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_case_1 {
WebDriver driver;
@BeforeClass
    public void login(){
    System.out.println("Launching Setup");
    driver = WebDriverFactory.getDriver("chrome");
    driver.get("http://qa.trycloud.net/index.php/login?clear=1");
    driver.manage().window().maximize();
    //    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    System.out.println("SetUp Complete!");

}
    @Test
    public void loginPage(){

        driver.findElement(By.id("user")).sendKeys("User21");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).click();
    }

@Test
    public void verifyTitle(){
    Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Files - Trycloud - QA"));
}




}
