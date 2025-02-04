package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class scrollWebpage {

    public static void main (String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://echoecho.com/htmlforms11.htm");

        JavascriptExecutor js = (JavascriptExecutor) driver;

// Scroll down (mentioned height):
        js.executeScript("window.scroll(0, 450)", "");

// Scroll up (mentioned height):
        js.executeScript("window.scroll(0, -450)", "");

// Scroll to the end of the page:
        js.executeScript("window.scroll(0,document.body.scrollHeight)","");

// Scroll to the top of the page:
        js.executeScript("window.scroll(0,0)", "");

// Scroll to a certain element:
        WebElement link = driver.findElement(By.linkText("online tool"));
        js.executeScript("arguments[0].scrollIntoView(true)",link);

// Using Robot class (up & down):
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
        robot.keyRelease(KeyEvent.VK_PAGE_UP);
        robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
    }
}
