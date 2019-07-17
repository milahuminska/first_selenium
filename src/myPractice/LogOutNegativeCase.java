package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutNegativeCase {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", //--> which driver you want to open
                "/Users/liudmilahuminska/Documents/selenium dependencies/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");

        driver.findElement(By.tagName("input")).sendKeys();
    }
}
