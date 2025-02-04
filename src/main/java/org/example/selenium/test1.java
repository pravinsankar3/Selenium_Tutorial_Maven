package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class test1 {
    public static void main(String[] args)
    {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");

        WebElement UploadButton = driver.findElement(By.id("uploadFile"));
        UploadButton.sendKeys("C:\\Users\\PRAVINR\\Downloads\\sampleFile.jpeg");

    }
}