package com.trycloud.tests.Userstory7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) {


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
    }}

