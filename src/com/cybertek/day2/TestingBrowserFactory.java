package com.cybertek.day2;

import com.cybertek.day2.BrowserFactory;
import org.openqa.selenium.WebDriver;

public class TestingBrowserFactory {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");

        driver.get("http://cybertekschool.com");
    }
}
