package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");

        //Opening pages
        //get()--> opens pages
        driver.get("http://practice.cybertekschool.com");

        //option+enter
        Thread.sleep(3000);

        // navigate().to()--> opens pages
        driver.navigate().to("http://cybertekschool.com");
        System.out.println(driver.getTitle());

    }
}
