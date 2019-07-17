package OfficeHours;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class June_26_BasicNavigations {

    public static void method2(){
        main (new String[] {"A"});
    }
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "/Users/liudmilahuminska/Documents/selenium dependencies/drivers/chromedriver");

        WebDriver driver = new ChromeDriver();//open the browser
        driver.get("http://www.google.com");// get method is an override method

        String PageTitle = driver.getTitle();
        System.out.println("Page title: " + PageTitle);

        //verifying the title
        if (PageTitle.contains("Google")) {
            System.out.println("Title is verified");
        } else {
            System.out.println("Title is not verified");
            System.exit(0);
        }


        String PageUrl = driver.getCurrentUrl();
        if (PageUrl.contains("www.google.com")) {
            System.out.println("Url is verified");
        } else {
            System.out.println("Url os not verified");
            System.exit(0);
        }
        // maximize the window:
        driver.manage().window().maximize();

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }
        //full screen
        driver.manage().window().fullscreen();
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        //refresh
        driver.navigate().refresh();
        sleep(1);

        //go back
        driver.navigate().back();
        sleep(3);

        //go forward
        driver.navigate().forward();
        sleep(1);

        //open Url:
        driver.navigate().to("http://amazon.com");
        // http: hypertext transfer protocol
        // https: hypertext transfer protocol secure
        sleep(5);
        driver.navigate().back();


        System.out.println("Test completed");
        driver.quit();
        //driver.close();-->if you have only one tag

        /*

        Differences between Navigate().to()   and get():
              get() will wait of the webpage fully uploaded
              navigate doesn't have to wait.(faster)

         close() vs Quite():
               close() will close a single tab
               quite() will close the entire tabs and browser

         */

        int[] arr={1,2};
        System.out.println(arr[100]);


    }
    public static void method1() throws Exception{
        Thread.sleep(3000);
    }

    public static void sleep(int a) {
        try {
            Thread.sleep(3000);
        } catch (Exception e) {

        }
    }

}
