package OfficeHours;

import com.cybertek.day2.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutomateGoogle {
    public static void main(String[] args) {
        test1();
    }

    public static void test1() {
        WebDriver driver = BrowserFactory.getDriver("chrome");//opens to browser
        driver.get("https://www.google.com");// open google.com


        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        /*
        <input class="gLFyf gsfi" maxlength="2048" name="q" type="text" jsaction="paste:puy29d" aria-autocomplete="both" aria-haspopup="false" autocapitalize="off" autocomplete="off" autocorrect="off" role="combobox" spellcheck="false" title="Search" value="" aria-label="Search" data-ved="0ahUKEwjJ-rLB2ZTjAhUthuAKHfG5AFEQ39UDCAY">
         */

        By SearchBoxLocator = By.xpath("//input[@title='Search']");//has to be unique

        WebElement SearchBox = driver.findElement(SearchBoxLocator);

        // SendKeys(): inputs value to search box..
        SearchBox.sendKeys("Apple" + Keys.ENTER);

        /*
        <h3 class
        //h3[@class='sA5rQ']

         */
        //By AppleLocator = By.xpath("//h3[@class='sA5rQ']");
        //formula for contain text xpath: //tagname[contains(text(),'some text')]


        By AppleLocator = By.xpath("//h3[contains(text(),'Official')]");
        WebElement AppleStore = driver.findElement(AppleLocator);

        System.out.println(AppleStore.getText()); // should contain apple, official
        AppleStore.click();

        driver.get(driver.getCurrentUrl());

        driver.navigate().back();

        driver.quit();

    }
}
