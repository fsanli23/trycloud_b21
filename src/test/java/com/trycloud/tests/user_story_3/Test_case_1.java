package com.trycloud.tests.user_story_3;

import com.trycloud.tests.user_story_1.LoginToWebsite;
import com.trycloud.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_case_1 {

    @Test
    public void verfyTitle() {//log-in trycloud and comparing actual title with expected title
        LoginToWebsite.loginTrycloud();
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Dashboard - Trycloud QA"));
    }


}
