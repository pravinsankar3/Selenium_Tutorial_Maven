package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class WindowsHandlingExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");

//1. Open new windows and switch controls
        String OldWindow = driver.getWindowHandle();
        WebElement NewWindowButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
        NewWindowButton.click();

        Set<String> Handles = driver.getWindowHandles();

        for (String Newwindows : Handles) {
            driver.switchTo().window(Newwindows);
        }

        WebElement logo = driver.findElement(By.xpath("/html/body/div/header/div[1]/a"));
        logo.click();

        driver.close();

        driver.switchTo().window(OldWindow);
//driver.switchTo().defaultContent(); (moves the control to the initially opened window)

//2.Find the no. of windows opened after click
        NewWindowButton.click();

        int NoOfWindows = driver.getWindowHandles().size();
        System.out.println("No of windows opened: " + NoOfWindows);

//3. Close all windows except parent window
        WebElement DontCloseMe = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]"));
        DontCloseMe.click();
        Set<String> NewWindowHandles = driver.getWindowHandles();

        for (String allWindows : NewWindowHandles) {
            if (!allWindows.equals(OldWindow)) {
                driver.switchTo().window(allWindows);
                driver.close();
            }
        }
    }
}
