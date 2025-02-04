package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Set;

public class TestWindows1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");

//      1. Open New Window & switch control to the new windows
        String OldWindow = driver.getWindowHandle();
        WebElement NewWindow = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
        NewWindow.click();

        Set<String> Handles = driver.getWindowHandles();
        for (String NewWindows : Handles) {
            driver.switchTo().window(NewWindows);
        }
        driver.close();
        driver.switchTo().window(OldWindow);
//      Switching control to the windows

//      2. Get the no. of windows
        WebElement NoOfWindows = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
        NoOfWindows.click();
        int NoOfWindowSize = driver.getWindowHandles().size();
        System.out.println("No of Windows: " + NoOfWindowSize);

//      3. Close all windows except Default window
        WebElement DontCloseMe = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]"));
        DontCloseMe.click();
        Set<String> AllWindowHandles = driver.getWindowHandles();

        for (String WindowHandles : AllWindowHandles) {
            if (!WindowHandles.equals(OldWindow)) {
                driver.switchTo().window(WindowHandles);
                Thread.sleep(3000);
                driver.close();
            }
        }

    }
}
