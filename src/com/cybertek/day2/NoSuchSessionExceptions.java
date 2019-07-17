package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

public class NoSuchSessionExceptions {
    public static void main(String[] args) throws InterruptedException {
       // afterClosingSingleTab();

       // afterClosingOneOfMany();
       // afterCallingQuit();
callAfterQuitting();
    }

    private static void callAfterQuitting() {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        System.out.println(driver.getTitle());
        driver.close();
// in order to avoid the exeption, we need re initialize the driver object

        driver = BrowserFactory.getDriver("chrome");

        System.out.println(driver.getTitle());
    }

    //after closing one tab
    public static void afterClosingSingleTab(){
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com");
        driver.close();

        System.out.println(driver.getTitle());

        // org.openqa.selenium.NoSuchSessionException: invalid session id --> getting this error because
        // we are trying to use a browser which we already closed
    }
    public static void afterClosingOneOfMany() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);
        driver.close();

        System.out.println(driver.getTitle());

        // we get this when we have ,ultiple tabs open and close one of them
        // and then try to use the driver object again
        //then try to use the driver object again

    }
    public static void afterCallingQuit() throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/open_new_tab");
        Thread.sleep(4000);
        driver.quit();

        System.out.println(driver.getTitle());

        //org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
        //-->we get this when we call driver after calling the quit method.
    }

}
