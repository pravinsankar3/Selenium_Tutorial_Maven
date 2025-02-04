package org.example.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class refresh {
    @Test
    public void refresh() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.google.com");

// Using Navigate
        driver.navigate().refresh();

// Using Get
        driver.get("ttp://www.google.com");
        driver.get(driver.getCurrentUrl());

// Using JavaScriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("location.reload()");          /* ("history.go(0)" instead of  "location.refresh()") */

// Using F5
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F5);
        robot.keyPress(KeyEvent.VK_F5);
    }
}
