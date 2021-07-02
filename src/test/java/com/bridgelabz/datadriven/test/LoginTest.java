package com.bridgelabz.datadriven.test;

import com.bridgelabz.datadriven.base.BaseClass;
import com.bridgelabz.datadriven.pages.HomePage;
import com.bridgelabz.datadriven.pages.Login;
import com.bridgelabz.datadriven.pages.MyPost;
import com.bridgelabz.datadriven.utility.DataProvider;
import com.bridgelabz.datadriven.utility.listener.CustomListener;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.awt.*;

@Listeners (CustomListener.class)
public class LoginTest extends BaseClass{

    @Test (dataProvider = "LoginDetails", dataProviderClass = DataProvider.class)
    public void loginTo_Application_with_valid_credentials (String userId, String userPassword) throws InterruptedException {
        Login login = new Login (driver);
        login.login (userId, userPassword);


        String actualUrl = driver.getCurrentUrl ();
        String expectedUrl = "https://www.linkedin.com/feed/";
        Assert.assertEquals (actualUrl, expectedUrl);

        String title = driver.getTitle ();
        String expectedTitle = "Feed | LinkedIn";
        Assert.assertEquals (title, expectedTitle);
    }
}
