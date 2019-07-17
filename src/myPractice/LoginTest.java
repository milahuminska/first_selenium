package myPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", //--> which driver you want to open
                "/Users/liudmilahuminska/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");


        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        WebElement button = driver.findElement(By.id("wooden_spoon"));

        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword");
        button.click();

    }
}
