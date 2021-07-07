package com.bridgelabz.datadriven.pages;

import com.bridgelabz.datadriven.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends BaseClass{

    /* @Description - Using FindBy for locating elements */
    @FindBy (xpath = "//input[@id='username']")
    WebElement userId;

    @FindBy (xpath = "//input[@id='password']")
    WebElement userPassword;

    @FindBy (xpath = "//button[normalize-space()='Sign in']")
    WebElement loginButton;

//    @FindBy(xpath = "//img[@id='ember34']")
//    WebElement clickOnMe;
//
//    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
//    WebElement signOut;
//
//    @FindBy(xpath = "//a[normalize-space()='Sign in']")
//    WebElement signIn;

    /* @Description - Called parameterized constructor */
    public Login (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }

    public void login(String userEmail, String userPass) {
        userId.sendKeys (userEmail);
        userPassword.sendKeys (userPass);
        loginButton.click ();
//        clickOnMe.click ();
//        signOut.click ();
//        signIn.click ();
    }
}