package com.cybertek.day2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class TitleVerification {
    public static void main(String[] args) {

        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login");


        WebDriver driver = BrowserFactory.getDriver("chrome");

        // got to the first website and verify title
        driver.get(urls.get(0));
        String expectedTitle = driver.getTitle();

       driver.get(urls.get(1));
       String actualTitle = driver.getTitle();

        verifyEquals(expectedTitle, actualTitle);

        driver.get(urls.get(2));
        actualTitle = driver.getTitle();

        verifyEquals(expectedTitle, actualTitle);
        //TO do verify url
        String expectedUrl = "http://practice.cybertekschool.com";
        for (String url : urls) {
            driver.get(url);
            String actualUrl= driver.getCurrentUrl();
            if(actualUrl.startsWith(expectedUrl)){
                System.out.println("PASS");
            }else{
                System.out.println("FAIL");
                System.out.println("actualUrl= "+ actualUrl);
                System.out.println("expectedUrl = "+expectedUrl);
            }

        }
    }

    private static void verifyEquals(String expectedTitle, String actualTitle) {
        if(expectedTitle.equals(actualTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("actualTitle = "+ actualTitle);
            System.out.println("expectedTitle = "+expectedTitle);
        }
    }


}
