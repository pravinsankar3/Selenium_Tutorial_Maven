package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Enter {
    @Test
    public void enter() throws AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
// Using sendKeys:
        searchBox.sendKeys("agni" + Keys.ENTER);

// Using Submit():
        searchBox.sendKeys("agni");
        searchBox.submit();

// Using Robot class:
        searchBox.sendKeys("agni");
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

// Using \n:
        searchBox.sendKeys("agni \n");
    }
}
