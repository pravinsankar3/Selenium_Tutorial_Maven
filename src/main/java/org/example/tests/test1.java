package org.example.tests;

import org.example.pageObjects.pageObjectss;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class test1 {

    String[][] loginCreds={
            {"student", "Password123"}
    };

    @DataProvider(name = "loginData")
    public String[][] login(){
        return loginCreds;
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String uName, String pWord){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0, 300)", "");

        PageFactory.initElements(driver, pageObjectss.class);

        pageObjectss.username.sendKeys(uName);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("password"))));
        password.sendKeys(pWord);

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("submit"))));
        submit.click();
    }
}
