package org.example.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.function.Function;

public class WaitsInSelenium {

    String[][] data = {
            {"practice", "SuperSecretPassword!"}
    };

    @DataProvider(name = "login")
    public String[][] login() {
        System.out.println("Entered Data provider");
        return data;
    }

    @Test(dataProvider = "login")
    public void loginPage(String uname, String pword) throws IOException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.get("https://practice.expandtesting.com/login");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement closeAD = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label=\"Close ad\"]")));
        closeAD.click();

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(uname);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys(pword);
        System.out.println("Executed testcase");

//      Takes screenshot:
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile = new File("C:\\Users\\PRAVINR\\Downloads\\sample.png");
        FileHandler.copy(sourceFile, destinationFile);

//      Takes screenshot of the entire screen (not only the window)
        Robot robot = new Robot();
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle rectangle = new Rectangle(screenSize);
        BufferedImage source = robot.createScreenCapture(rectangle);
        File destinationFile2 = new File("C:\\Users\\PRAVINR\\Downloads\\sample2.png");
        ImageIO.write(source, "png", destinationFile2);

        WebElement submitButton = driver.findElement(By.xpath("//button[text()=\"Login\"]"));


//      Explicit wait to submit:
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=\"Login\"]")));
        submitButton.click();
        System.out.println("sumbit clicked");

//      Fluent wait applied:
        Wait<WebDriver> wait1 = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(30))
                .ignoring(NoSuchElementException.class);

        WebElement logOut = wait1.until(new Function<WebDriver, WebElement>() {

            public WebElement apply(WebDriver webDriver) {
                return driver.findElement(By.xpath("//i[normalize-space(text())=\"Logout\"]"));
            }
        });
        logOut.click();

        driver.quit();
    }
}
