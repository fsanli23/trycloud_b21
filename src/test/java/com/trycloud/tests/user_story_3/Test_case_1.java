package com.trycloud.tests.user_story_3;

import com.trycloud.utilities.Driver;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test_case_1 {
@Test
public void logIn(){
    
}

@Test
    public void verifyTitle(){
    Assert.assertTrue(driver.getTitle().equalsIgnoreCase("Files - Trycloud - QA"));
}




}
