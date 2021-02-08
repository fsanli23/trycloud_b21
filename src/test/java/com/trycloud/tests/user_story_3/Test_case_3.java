package com.trycloud.tests.user_story_3;

import com.trycloud.tests.UserStory1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_case_3 {

//Test case #3 - verify users can add a file to favorites.
//1. Login as a user
//2. Click action-icon from any file on the page
//3. Choose “Add to Favorites” option
//4. Click “Favorites” sub-module on the lest side
//5. Verify the chosen file is listed on the table
//(Pre-condition: there should be at least 1 file is uploaded)

    @Test
    public void verifyFavorites() {
        LoginToWebsite.loginTrycloud();

        // clicking on the all file module
        WebElement allfilesModules = Driver.getDriver().findElement(By.xpath("(//a[@aria-label='Files'])[1]"));
        allfilesModules.click();

        //first files name. we will check it after adding to favorite
        String name = Driver.getDriver().findElement(By.xpath("(//span[@class='innernametext'])[1]")).getText();

        System.out.println(name);


        //clicking first available action button(if there is a file this will be the action for first file)
        WebElement action = Driver.getDriver().findElement(By.xpath("(//a[@class='action action-menu permanent'])[1]"));
        action.click();


        //clicking favorite button to add favorite
        WebElement favoriteButtonInAction = Driver.getDriver().findElement(By.xpath("//a[@data-action='Favorite']"));
        favoriteButtonInAction.click();


        //clicking favorite to confirm if added file in the favorite
        WebElement favorite = Driver.getDriver().findElement(By.xpath("//a[@class='nav-icon-favorites svg']"));
        favorite.click();

// Asserting if the file added
        String AddedFileName = Driver.getDriver().findElement(By.xpath("(//span[@class='innernametext'])[16]")).getText();

        Assert.assertTrue(name.equalsIgnoreCase(AddedFileName));


    }


}
