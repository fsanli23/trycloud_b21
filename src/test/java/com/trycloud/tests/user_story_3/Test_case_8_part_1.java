package com.trycloud.tests.user_story_3;

/*
3. Story: As a user, I should be able to access to Files module.
    Test case #8 - verify users can delete a file/folder.
1. Login as a user
2. Click action-icon from any file on the page
3. Choose “delete files” option
4. Click deleted files on the left bottom corner
5. Verify the deleted file is displayed no the page.
    (Pre-condition: there should be at least 1 file is uploaded inside files page)
 */

import com.trycloud.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_case_8_part_1 {

WebDriver driver;

    @Test(description =  "user should able to login")
    public void test_1(){


    


    }


    @Test(description = "user should able to access to Files module")
    public void Test_2(){


        //2. Click action-icon from any file on the page
        WebElement action_icon = driver.findElement(By.xpath("(//a[@class='action action-menu permanent'])[1]"));
        action_icon.click();

        BrowserUtils.sleep(1);

        //3. Choose “delete files” option
        WebElement delete_button = driver.findElement(By.xpath("(//span[@class='icon icon-delete'])[2]"));
        delete_button.click();

        BrowserUtils.sleep(1);

        //4. Click deleted files on the left bottom corner
        WebElement deleted_files = driver.findElement(By.xpath("//a[@class='nav-icon-trashbin svg active']"));
        deleted_files.click();

        BrowserUtils.sleep(1);

        //5. Verify the deleted file is displayed no the page.







    }

}
