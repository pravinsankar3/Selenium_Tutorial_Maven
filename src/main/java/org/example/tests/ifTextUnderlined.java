package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ifTextUnderlined {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement tamilText = driver.findElement(By.xpath("//a[contains(text(),'தமிழ்')]"));
        String underline1 = tamilText.getCssValue("text-decoration");

// Hovering over the text:
        Actions action = new Actions(driver);
        action.moveToElement(tamilText);
        action.perform();

// Checking if the text is underlined:
        String underline2 = tamilText.getCssValue("text-decoration");

//Print the CSS value to check is the text is underlined:
        System.out.println("Before hovering: "+underline1);
        System.out.println("After hovering: "+underline2);
    }
}
