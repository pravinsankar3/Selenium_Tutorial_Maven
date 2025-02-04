package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FrameExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/frames.php");

        driver.switchTo().frame(0);
        WebElement LinkInFrame = driver.findElement(By.xpath("/html/body/div/header/div[1]/a"));
        LinkInFrame.click();

    /* To get the text behind the button:
        String textInButton = driver.findElement(By.xpath("/html/body/div/header/div[1]/a")).getText();
        System.out.println(textInButton); */
        /* (use .getAttribute to get the values like css values) */

        driver.switchTo().defaultContent();
        // used to switch to the original content

    }
}