package com.bridgelabz.datadriven.test;

import com.bridgelabz.datadriven.base.BaseClass;
import com.bridgelabz.datadriven.pages.Login;
import com.bridgelabz.datadriven.utility.DataProvider;
import com.bridgelabz.datadriven.utility.listener.CustomListener;
import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners (CustomListener.class)
public class LoginTest extends BaseClass{

    @Test (dataProvider = "LoginDetails", dataProviderClass = DataProvider.class)
    public void loginTo_Application_with_valid_credentials (String userEmail, String userPass) throws InterruptedException {
        Login login = new Login (driver);
        login.login (userEmail, userPass);


//        String actualUrl = driver.getCurrentUrl ();
//        String expectedUrl = ":https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin";
//        Assert.assertEquals (actualUrl, expectedUrl);
    }
}
