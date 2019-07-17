package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
    public static void main(String[] args) {
        //1. open chrome
        //2. go to cybertek practice website
        //    url: http://amazon.com/
        //3. verify title:
        //        expected value is ‘Sale’

        System.setProperty("webdriver.chrome.driver", //--> which driver you want to open
                "/Users/liudmilahuminska/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        String expected = "Sale";
        String actual = driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expected = " + expected);
            System.out.println("actual = " + actual);
        }


    }



}
