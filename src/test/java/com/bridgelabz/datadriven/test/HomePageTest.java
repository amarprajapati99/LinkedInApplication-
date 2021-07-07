package com.bridgelabz.datadriven.test;

import com.bridgelabz.datadriven.base.BaseClass;
import com.bridgelabz.datadriven.pages.HomePage;
import com.bridgelabz.datadriven.pages.Login;
import com.bridgelabz.datadriven.utility.listener.CustomListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListener.class)
public class HomePageTest extends BaseClass{

    @Test
     public void TestHome_isWorkingOrNot() throws InterruptedException {
        Login login = new Login (driver);
        login.login ("abc@gmail.com","JayHindJayBharat");

        HomePage homePage = new HomePage (driver);
        homePage.sendText ();
    }
}
