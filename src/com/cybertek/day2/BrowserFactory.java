package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", //--> which driver you want to open
                    "/Users/liudmilahuminska/Documents/selenium dependencies/drivers/chromedriver");
            return new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", //--> which driver you want to open
                    "/Users/liudmilahuminska/Documents/selenium dependencies/drivers/geckodriver");

            return new FirefoxDriver();
        } else {

            return null;


        }


    }
}
