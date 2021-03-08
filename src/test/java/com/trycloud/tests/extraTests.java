package com.trycloud.tests;

import com.sun.tools.javac.tree.DCTree;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class extraTests {
    @Test
    public void hello(){
        System.out.println("hello world");
    }
    @DataProvider(name="TestData")
    public Object[][] getData(){
        Object[][] data= new Object[3][2];
        data[0][0]="User21";
        data[0][1]="Userpass123";
        data[1][0]="User111";
        data[1][1]="Userpass123";
        data[2][0]="User51";
        data[2][1]="Userpass123";


        return data;
    }
    @Test(dataProvider = "TestData")
    public void login(String username, String password){

       Driver.getDriver().get("http://qa2.trycloud.net/");

        //TODO: Enter Username:
        WebElement inputUserName = Driver.getDriver().findElement(By.id("user"));
        inputUserName.sendKeys(username);

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        // TODO: Enter Password:
        WebElement inputPassword = Driver.getDriver().findElement(By.id("password"));
        inputPassword.sendKeys(password);

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.

        //TODO: Click to login button
        WebElement loginButton = Driver.getDriver().findElement(By.id("submit-form"));
        loginButton.click();

        BrowserUtils.sleep(1);  // After user name 1 second sleeping.
        Driver.closeDriver();

    }

}
