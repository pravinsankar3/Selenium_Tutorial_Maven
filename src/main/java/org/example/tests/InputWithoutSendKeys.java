package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;

public class InputWithoutSendKeys {
    public static void main(String[] args) throws AWTException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;

// Sending Input using Javascript Executor (without findElement):
        js.executeScript("document.getElementsByName('q')[0].value='Duckling'", "");

// Sending Input using Javascript Executor (with findElement):
        WebElement searchBox = driver.findElement(By.name("q"));
        js.executeScript("arguments[0].value='Riya'", searchBox);

// Using Robot class:
        driver.switchTo().activeElement();
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyPress(KeyEvent.VK_I);
        robot.keyRelease(KeyEvent.VK_I);
        robot.keyPress(KeyEvent.VK_Y);
        robot.keyRelease(KeyEvent.VK_Y);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyRelease(KeyEvent.VK_A);
    }
}
