package com.trycloud.tests.Userstory7;

import com.trycloud.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

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


        WebElement searchButton= Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        searchButton.click();
        searchButton.sendKeys("Readme"+ Keys.ENTER);
        WebElement searchedFile=Driver.getDriver().findElement(By.xpath("//span[@class='unified-search__result-content']"));
        Assert.assertTrue(searchButton.isDisplayed());

        /*WebElement Search = driver.findElement(By.xpath("//div[@class='header-menu unified-search']"));
        Search.click();
        Search.sendKeys("Readme"+ Keys.ENTER);
        WebElement searchedFile= Driver.getDriver().findElement(By.xpath("//span[@class='unified-search__result-content']"));
        WebElement input = driver.findElement(By.xpath("//div[@class='unified-search__input-wrapper']"));
        input.click();*/









    }}

