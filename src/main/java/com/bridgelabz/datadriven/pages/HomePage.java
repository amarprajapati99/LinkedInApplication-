package com.bridgelabz.datadriven.pages;

import com.bridgelabz.datadriven.base.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass{


    /* @Description - Used FindBy Annotations for getting elements using locators */

    @FindBy (xpath = "//input[@placeholder='Search']")
    WebElement textSearch;
    @FindBy (xpath = "//a[@id='ember23']//*[local-name()='svg']")
    WebElement myNetwork;
    @FindBy(xpath = "//a[@id='ember29']")
    WebElement notification;
    @FindBy(xpath = "//span[normalize-space()='Home']")
    WebElement home;

    /* @Description - Called parameterized constructor */

    public HomePage (WebDriver driver) {
        PageFactory.initElements (driver, this);
    }

    /* @Description - send.Keys method is to set the data in to the search box
     * actions.sendKeys (Keys.ENTER).perform () method is used to perform keyboard events
     * Called method for using all the elements to be done */

    public void sendText() throws InterruptedException {
        textSearch.sendKeys ("tata consultancy services");
        Actions actions = new Actions (driver);
        actions.sendKeys (Keys.ENTER).perform ();
        Thread.sleep (6000);
        myNetwork.click ();
        Thread.sleep (6000);
        notification.click ();
        Thread.sleep (6000);
        home.click ();
        Thread.sleep (5000);

    }
}