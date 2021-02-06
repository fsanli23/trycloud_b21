package com.trycloud.tests.user_story_3;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_case_4 {
    //Test case #4 - verify users can remove a file from favorites.
    //1. Login as a user
    //2. Click action-icon from any file on the page
    //3. Click “Remove from Favorites” option
    //4. Verify that the file is removed from Favorites sub-module’s table.
    //(Pre-condition: there should be at least 1 file is added to favorites table)
    @Test
    public void RemoveFromFAvorite() throws InterruptedException {
        LoginToWebsite.loginTrycloud();

        // clicking on the all file module
        WebElement allfilesModules = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        allfilesModules.click();

        //first files name. we will check it after adding to favorite
        String name = Driver.getDriver().findElement(By.xpath("(//span[@class='innernametext'])[1]")).getText();


        //clicking first available action button(if there is a file this will be the action for first file)
        WebElement action = Driver.getDriver().findElement(By.xpath("(//a[@class='action action-menu permanent'])[1]"));
        action.click();

        //clicking favorite button to add favorite
        WebElement favoriteButtonInAction = Driver.getDriver().findElement(By.xpath("//a[@data-action='Favorite']"));
        favoriteButtonInAction.click();
        Thread.sleep(10000);
        //clicking one more time on action
        WebElement action2 = Driver.getDriver().findElement(By.xpath("(//a[@class='action action-menu permanent'])[1]"));
        action2.click();
        //clicking remove from favorite list
        WebElement removefrom = Driver.getDriver().findElement(By.xpath("//a[@class='menuitem action action-favorite permanent']"));
        removefrom.click();

///

//Driver.closeDriver();
    }

}
