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

    /* @Description - Called parameterized constructor */

    public Login (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }

    public void setEmail(String inputEmail) {
        userId.sendKeys(inputEmail);
    }

    public void setPassword(String inputPassword) {
        userPassword.sendKeys(inputPassword);
    }

    public void clickLogin() {
        loginButton.click();
    }

    public void login(String userId, String userPassword) throws InterruptedException {

        setEmail(userId);
        setPassword(userPassword);

        clickLogin();
        Thread.sleep(2000);

    }
}