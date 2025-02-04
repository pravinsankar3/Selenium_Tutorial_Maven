package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InteractingWithWebElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.Gecko.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");

        WebElement Element1 = driver.findElement(By.id("APjFqb"));
        Element1.sendKeys("pongal 2024 coimbatore events" + Keys.ENTER);
    }
}
