package org.example.tests;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class maximizeWindow {

    @Test
    public void maximizewindow(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
// using ChromeOptions:
        ChromeOptions chr = new ChromeOptions();
        chr.addArguments("--start-maximized");

        WebDriver driver = new ChromeDriver(chr);
        driver.navigate().to("http://www.irctc.com");

// using most common method:
        driver.manage().window().maximize();

// Using the Dimension class:
        Dimension dim = new Dimension(1920, 1080);
        driver.manage().window().setSize(dim);
    }
}
