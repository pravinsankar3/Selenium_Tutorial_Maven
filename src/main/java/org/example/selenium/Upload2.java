package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Upload2 {
    public static void main(String[] args) throws InterruptedException {
// Set the WebDriver path correctly
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");

// Find the file input element and directly upload the file
        WebElement uploadInput = driver.findElement(By.id("uploadFile"));
        System.out.println("Before uploading the file");

// Directly sending the file path to the input element
        String filePath = "C:\\Users\\PRAVINR\\Downloads\\sampleFile.jpeg";
        uploadInput.sendKeys(filePath);

        System.out.println("File uploaded successfully");
        Thread.sleep(4000);  // Let the file upload process complete
        driver.quit();       // Close the browser session
    }
}
