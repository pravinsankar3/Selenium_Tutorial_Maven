package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetVsNavigate {

    @Test
    public void GetVsNavigate() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        WebDriverWait wait = new WebDriverWait(driver);

// Using Get:
        driver.get("http://www.google.com");

// Using Navigate:
        driver.navigate().to("http://www.google.com");

        WebElement searchStuff = driver.findElement(By.name("q"));
        searchStuff.sendKeys("new missles" + Keys.ENTER);

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
    }
}
