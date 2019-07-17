package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

public class NavigationBackAndForth {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        //go to first website
        driver.get("https:google.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());

        //go to second website
        driver.get("https://etsy.com");
        Thread.sleep(2000);
        System.out.println(driver.getTitle());


        //go back to google

        driver.navigate().back();
        System.out.println(driver.getTitle());

        // go/return/navigate to etsy
        driver.navigate().forward();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);

        //refresh the current page
        driver.navigate().refresh();
        System.out.println(driver.getTitle());

    }
}
