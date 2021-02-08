package com.trycloud.tests.Userstory7;


import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Testcase7 {

    @Test
    public void SearchButton(){
        LoginToWebsite.loginTrycloud();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchIcon=Driver.getDriver().findElement(By.xpath("//a[@class='header-menu__trigger']"));
        searchIcon.click();

        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchButton= Driver.getDriver().findElement(By.xpath("//input[@type='search']"));
        searchButton.click();
        searchButton.sendKeys("Readme"+ Keys.ENTER);
        WebElement searchedFile=Driver.getDriver().findElement(By.xpath("//span[@class='unified-search__result-content']"));
        Assert.assertTrue(searchButton.isDisplayed());
    }
}
/*
7.Story: As a user, I should be able to access search any item/ users from the homepage.
Test case #1 - Verify users can search any files/folder/users from the search box.
1.Login as a user
2.Click magnifier icon         on the right top
3.Search any existing file/folder/user name
4.Verify the app displays the expected result opt
 */

