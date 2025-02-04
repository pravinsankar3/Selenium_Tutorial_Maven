package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class abc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.selenium.dev/downloads/");
        List<WebElement> browserList = driver.findElements(By.xpath("//div[@id=\"supported-browsers\"]/div"));
        int size = browserList.size();
    }
}