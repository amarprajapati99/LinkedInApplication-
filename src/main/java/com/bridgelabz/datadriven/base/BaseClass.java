package com.bridgelabz.datadriven.base;

import com.bridgelabz.datadriven.utility.CrossBrowser;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;

    @Parameters ("browserName")
    @BeforeTest
    public void setup (String browserName) {

        driver = CrossBrowser.selectDriver(browserName);
       // WebDriverManager.chromedriver ().setup ();
        driver = new ChromeDriver ();

        driver.manage ().window ().maximize ();
        driver.get ("https://www.linkedin.com/login");
        driver.manage ().timeouts ().implicitlyWait (20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDown () {
        driver.close ();
    }
}