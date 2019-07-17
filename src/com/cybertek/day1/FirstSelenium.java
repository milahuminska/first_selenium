package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {
    public static void main(String[] args) {
     // open browser
        System.setProperty("webdriver.chrome.driver", //--> which driver you want to open
                "/Users/liudmilahuminska/Documents/selenium dependencies/drivers/chromedriver");
        //set driver
        WebDriver driver = new ChromeDriver();
        // this is a command to open a new chrome browser


        //webdriver represents the browser
        driver.get("http://practice.cybertekschool.com");
        // get opens the url provided in the argument

        String title = driver.getTitle();
        //getTitle returns the title of the current
        System.out.println("title = " + title);

        String url = driver.getCurrentUrl();
        //getCurrentUrl returns the url of the current page
        System.out.println("url = " + url);


    }
}
