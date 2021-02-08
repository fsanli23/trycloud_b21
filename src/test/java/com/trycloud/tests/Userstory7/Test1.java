package com.trycloud.tests.Userstory7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {

    @Test
    public void AccessToContactsModule() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://qa3.trycloud.net/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='user']"));
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement login = driver.findElement(By.xpath("//input[@class='login primary']"));

        username.sendKeys("User21");
        password.sendKeys("Userpass123");

        login.click();

        WebElement Search = driver.findElement(By.xpath("//div[@class='header-menu unified-search']"));
        Search.click();
        WebElement input = driver.findElement(By.xpath("//div[@class='unified-search__input-wrapper']"));
        input.click();

        //

}}
