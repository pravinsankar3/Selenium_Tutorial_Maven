package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkExamples {
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");

        WebElement Link1 = driver.findElement(By.partialLinkText("Home"));
        Link1.click();
    }
}
