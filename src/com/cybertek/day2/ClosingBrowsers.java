package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

public class ClosingBrowsers {
    public static void main(String[] args) throws InterruptedException {
        closeSingleTab();
        closeOneOfManyTabs();
        closeEverything();

    }

    public static void closeSingleTab() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(2000);

        //close --> closes current tab
        driver.close();

    }
    public static void closeOneOfManyTabs() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);

        //close --> closes current tab
        Thread.sleep(4000);
        //closes the first tab
        driver.close();
    }
    public static void closeEverything() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);

        //quit --> closes all tabs
        driver.quit();
    }


}
