package com.bridgelabz.datadriven.pages;

import com.bridgelabz.datadriven.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class MyPost extends BaseClass{
    /* Used FindBy Annotations for getting elements using locators
     * Initialize web elements */

    @FindBy (xpath = "//div[@class = 'display-flex align-items-center mt2 mr4 ml4']")
    WebElement startPost;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/p[1]")
    WebElement element;

    @FindBy(className = "share-box_actions")
    WebElement share;

    @FindBy(xpath = "//li-icon[@type='image-icon']//*[local-name()='svg']")
    WebElement photo;

    @FindBy(xpath = "/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/button[2]/span[1]")
    WebElement clickDone;

    @FindBy(xpath = "//img[@alt='LIKE']")
    WebElement like;

    /* Called parameterized constructor */
    public MyPost (WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    /*@Description -Called method setPost for using all the elements to be done
     * with operations.
     * Used Action class for moving elements and sending keys
     * And also for uploading media*/

    public void sharePost() throws InterruptedException {
        Actions post_action = new Actions(driver);
        post_action.moveToElement(startPost).click().perform();
        Thread.sleep(4000);

        post_action.sendKeys(element,"This is my first post").build().perform();
        Thread.sleep(4000);

        post_action.moveToElement(share).click().perform();
        Thread.sleep(3000);

    }

    /*@Description - Added Robot Class
     * Performed robot for uploading media
     * Here copied the media address using setClipboardData
     * used robot key events for operating operations*/

    public void sharePhoto() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        startPost.click();
        Thread.sleep(3000);
        photo.click();
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

        setClipboardData("C:\\Users\\Amar\\Downloads\\images.jpg");
        Thread.sleep(2000);

        clickDone.click();
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        share.click();
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);

    }

    public void setClipboardData(String string) throws InterruptedException, AWTException {
        Robot robot = new Robot();
        StringSelection stringSelection = new StringSelection (string);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        Thread.sleep(3000);

        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(3000);

        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }

    /*@Desc - Used likePost() method for operating on like element*/

    public void likePost() throws InterruptedException, AWTException {
        Robot robot = new Robot();
        like.click();
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(3000);
    }
}
