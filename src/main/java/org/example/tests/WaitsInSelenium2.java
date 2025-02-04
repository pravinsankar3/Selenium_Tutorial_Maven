package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class WaitsInSelenium2 {

    @Test
    public void LoginTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
// Used Implicit wait:
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys("student");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Password123");

// Used Explicit wait:
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Submit\"]")));
        submitButton.click();
        System.out.println("Submitted");
//      "//button[text()=\"Submit\"]"
        driver.quit();

        WebDriverWait wait1 = new WebDriverWait(driver,Duration.ofSeconds(20));
//        wait1.until(ExpectedConditions.)


    }
}

