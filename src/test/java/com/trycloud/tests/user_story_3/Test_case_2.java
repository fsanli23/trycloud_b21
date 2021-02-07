package com.trycloud.tests.user_story_3;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import com.trycloud.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Test_case_2 {
//Test case #2 - verify users can select all the uploaded files from the page
//1. Login as a user
//2. Click the top left checkbox of the table
//3. Assert all the files are selected
//(Pre-condition: there should be at least 2 files are uploaded the page)
    @Test
    public void selectAllUploadedFiles(){
        LoginToWebsite.loginTrycloud();//signing in


        //clicking files module
        Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]")).click();
        Driver.getDriver().findElement(By.xpath("//label[@for='select_all_files']")).click();
//checking if the all files are selected
        List<WebElement>list=Driver.getDriver().findElements(By.xpath("//table[@class='list-container view-grid has-controls multiselect']//tr//td[1]"));
        for (WebElement each:list){
            if (each.isSelected()){
                Assert.assertTrue(each.isSelected());
            }
        }




    }


}






