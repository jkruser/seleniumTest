package com.deanhealth.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Application {



    /**
     * This method uses the isEnabled method.
     * Method Descriptions:
     * isEnabled is used when you want to verify whether a certain element is enabled or not before executing a command
     * isDisplayed is used when you want to verify whether a certain element is displayed or not before executing a command
     * isSelected is used when you want to verify whether a certain check box, radio button, or option in a drop
     *      down box is selected. It does not work on other elements
     * @param args
     */
    public static void main(String[] args) {
        //declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String baseUrl = "http://demo.guru99.com/test/newtours/";

        //launch Chrome and direct it to the Base URL
        driver.get(baseUrl);

        WebElement txtbox_username = driver.findElement(By.name("userName"));

        if (txtbox_username.isEnabled()) {
            txtbox_username.sendKeys("tutorial");
        }
    }

    /**
     * This method is supposed to wait but doesn't appear like the wait is working
     * @param args
     */
//    public static void main(String[] args) {
//        //declaration and instantiation of objects/variables
//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        WebDriverWait myWaitVar = new WebDriverWait(driver, 30);
//
//        String baseUrl = "http://demo.guru99.com/test/newtours/";
//
//        //launch Chrome and direct it to the Base URL
//        driver.get(baseUrl);
//
//        myWaitVar.until(ExpectedConditions.visibilityOfElementLocated(By.name("userName")));
//        driver.findElement(By.name("userName")).sendKeys("tutorial");
//
//        //close Chrome
//        driver.close();
//    }

    /**
     * This method opens a site with an alert and returns the text of the alert box
     * @param args
     */
//    public static void  main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        String alertMessage = "";
//
//        driver.get("http://jsbin.com/usidix/1");
//        driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
//        alertMessage = driver.switchTo().alert().getText();
//
//        //Test out Implicit Wait
////        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//        driver.switchTo().alert().accept();
//
//        System.out.println(alertMessage);
//        driver.quit();
//    }

    /**
     * This method will switches to the correct frame and click on a link
     * @param args
     */
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://demo.guru99.com/selenium/deprecated.html");
//        driver.switchTo().frame("classFrame");
//        driver.findElement(By.linkText("Deprecated")).click();
////        driver.close();
//    }

    /**
     * This method tests the difference between close and quit (close will close only the directly opened window
     * where quit will close all opened windows)
     * @param args
     */
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.get("http://www.popuptest.com/popuptest2.html");
////        driver.close();
//        driver.quit();
//    }


    /**
     * This method tests the tagName for the element
     * @param args
     */
//    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        String baseUrl = "http://www.facebook.com";
//        String tagName = "";
//
//        driver.get(baseUrl);
//        tagName = driver.findElement(By.id("email")).getTagName();
//        System.out.println(tagName);
//        driver.close();
//        System.exit(0);
//    }

    /**
     * This method tests that the browser can open and read the title
     * @param args
     */
//    public static void main(String[] args) {
//        //declaration and instantiation of objects/variables
//        //System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
//        //WebDriver driver = new FirefoxDriver();
//        //comment the above 2 lines and uncomment below 2 lines to use Chrome
//        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        String baseUrl = "http://demo.guru99.com/test/newtours/";
//        String expectedTitle = "Welcome: Mercury Tours";
//        String actualTitle = "";
//
//        //launch Firefox and direct it to the Base URL
//        driver.get(baseUrl);
//
//        //get the actual value of the title
//        actualTitle = driver.getTitle();
//
//        /*
//         * compare the actual title of the page with the expected one and print
//         * the result as "Passed" or "Failed"
//         */
//        if(actualTitle.contentEquals(expectedTitle)) {
//            System.out.println("Test Passed!");
//        } else {
//            System.out.println("Test Failed!");
//        }
//
//        //close Firefox
//        driver.close();
//    }
}
