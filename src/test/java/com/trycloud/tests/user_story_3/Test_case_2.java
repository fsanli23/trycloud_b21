package com.trycloud.tests.user_story_3;

import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_case_2 {

    WebDriver driver;
    @BeforeClass
    public void login(){

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://qa3.trycloud.net/");
        driver.manage().window().maximize();



    }
    @Test
    public void loginPage(){

        driver.findElement(By.id("user")).sendKeys("User21");
        driver.findElement(By.id("password")).sendKeys("Userpass123");
        driver.findElement(By.id("submit-wrapper")).click();
    }
@Test
public  void allBoxesSelected() throws InterruptedException {

    WebElement allbutton= driver.findElement(By.xpath("(//table//tr[1]//td[1])[1]/input"));
    Thread.sleep(50000);
    allbutton.click();




}





}
