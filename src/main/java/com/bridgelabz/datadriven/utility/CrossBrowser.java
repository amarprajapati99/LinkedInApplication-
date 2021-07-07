package com.bridgelabz.datadriven.utility;

import com.bridgelabz.datadriven.base.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowser extends BaseClass{
    public static WebDriver selectDriver (String browser) {

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver ().setup ();
                driver = new ChromeDriver ();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver ().setup ();
                driver = new FirefoxDriver ();
                break;
            case "edge":
                WebDriverManager.edgedriver ().setup ();
                driver = new EdgeDriver ();
                break;
            case "internet explore" :
                WebDriverManager.iedriver ().setup ();
                driver = new InternetExplorerDriver ();
                break;
            default:

        }
        return driver;
    }
}
