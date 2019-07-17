package OfficeHours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class July_3_WebElementMethods {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        WebElement element = driver.findElement(By.xpath(""));

    /*
    Webelement methods:
         1.sendKeys
         2.click
         3.getAtribute
         4.getText
         5.gettagname
         6.clear
         7.submit
         8.isSelected
         9.isDisplayed
         10.isEnable

     */

    //sendKeys(str): to enter input
        element.sendKeys("input values");

        //click(): used to click the element
        element.click();

        //getAttribute(str ): to get the value of the given attribute
        element.getAttribute("attribute goes here");


        //gettext(): returns the linktext of the webElement
        String str2 = element.getText();

        //getname(): returns the tagname of the html as String
        String str3 = element.getTagName();

        //clear(): clears the inputs
        element.clear();

        //submit(): Keys.Enter, submits;
        element.submit();

        //isSelected(): returns boolean expression, used for verifying radio button and check boxes
        boolean A = element.isSelected();

        //isDisplayed(): return boolean expression, verify if the element is displayed
        boolean B = element.isDisplayed();

        //isEnabled():
        boolean C = element.isEnabled();










    }

}
