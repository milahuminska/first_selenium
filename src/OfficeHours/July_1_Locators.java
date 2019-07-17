package OfficeHours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class July_1_Locators {
    public static void main(String[] args) {
        /*

        locators : created from Bt abstract class
                id(),
                name(),
                className(),
                tagName(),
                linkText(),
                partiallinkText(),
                xpath(),
                css(),

      WebElements:
                   findElement(By): for unique locators only,returns single webElement
                   findElements(): for non-unique locators

        write xpath(): //tagname[@attribute='value of the attribute' and @attribute='value of the attribute' and ...]

//input[@name='q']

         */
        WebDriver driver = new ChromeDriver();

        // id():
               By IdLocator = By.id("id goes here");
               WebElement element1 = driver.findElement(IdLocator); //only if the locator is unique

       List<WebElement>list =driver.findElements(IdLocator);
       // to click second element:
        list.get(1).click();

        //name:
        By name = By.name("name goes here");
        WebElement nameElement = driver.findElement(name);







    }
}
