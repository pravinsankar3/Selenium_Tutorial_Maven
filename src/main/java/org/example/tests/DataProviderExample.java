package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    String[][] logindetails = {
            {"student", "Password123"},
            {"student1", "Password123"},
            {"student", "Password"},
            {"student123", "Password"}
    };

    @DataProvider(name = "loginData")
    public String[][] loginCreds() {
        return logindetails;
    }

    @Test(dataProvider = "loginData")
    public void Login(String uname, String pword) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://practicetestautomation.com/practice-test-login/");

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(uname);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(pword);

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=\"Submit\"]")));
        WebElement submitButton = driver.findElement(By.xpath("//button[text()=\"Submit\"]"));
        submitButton.click();
        System.out.println("Submit button clicked");
//        driver.quit();

    }
}
