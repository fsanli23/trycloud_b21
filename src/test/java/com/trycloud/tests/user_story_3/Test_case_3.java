package com.trycloud.tests.user_story_3;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Test_case_3 {

    WebDriver driver;

    @BeforeClass
    public void login() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa.trycloud.net/index.php/login?clear=1");
        driver.manage().window().maximize();


    }

    @Test
    public void loginPage() {

        driver.findElement(By.id("user")).sendKeys("User21");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).click();
    }

@Test
    public void addToFavorites() {

        WebElement actionButton = driver.findElement(By.xpath("(//a[@class='action action-menu permanent'])[2]"));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        actionButton.click();


    }


}
