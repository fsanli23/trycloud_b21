package com.trycloud.tests.user_story_3;

import org.testng.annotations.Test;

public class UserStory_3 {

    @Test
    public void UserStory_3(){





        /*
         *  TODO: As a user, I should be able to access to Files module.
         */
        Test_case_8 testCase8 = new Test_case_8();
        testCase8.DeleteFile();                         //verify users can delete a file/folder.
        testCase8.detailsFile();                        //verify users can write comments to files/folders.


        /*
         * TODO: verify users can change the app Settings.
         */
        Test_case_9 testCase9 = new Test_case_9();
        testCase9.settingFunctionality();               // User can change app settings.


        /*
         * TODO: verify users see the app storage usage
         */
        Test_case_10 testCase10 = new Test_case_10();
        testCase10.storageUsage();                      // User can see the app storage usage.


    }


}
