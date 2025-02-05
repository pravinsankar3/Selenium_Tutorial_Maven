package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class DownloadExample {
    public static void main(String[] args)
            throws InterruptedException
    {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/upload-download.php");

        WebElement downloadButton = driver.findElement(By.id("downloadButton"));
        downloadButton.click();

        Thread.sleep(2500);
// Getting the file location to check if the file is downloaded
        File fileLocation = new File("C:\\Users\\PRAVINR\\Downloads");
        File[] totalFiles = fileLocation.listFiles();

// to verify if the download is successful (through code)
        for(File file: totalFiles)
        {
            if (file.getName().equals("sampleFile.jpeg")) {
                System.out.println("Download is successfully");
                break;
            }
        }
    }
}