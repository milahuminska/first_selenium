package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest {
    public static void main(String[] args) {
        //1. open chrome
        System.setProperty("webdriver.chrome.driver", //--> which driver you want to open
                "/Users/liudmilahuminska/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        //2. go to cybertek practice website
        //    url: http://practice.cybertekschool.com/
        driver.get("http://practice.cybertekschool.com");

        //3. verify title:
        //        expected value is ‘Practice’
        String expected = "Practice";
        String actual = driver.getTitle();

        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


    }
}
