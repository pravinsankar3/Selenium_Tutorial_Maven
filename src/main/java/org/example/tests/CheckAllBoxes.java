package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckAllBoxes {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://total-qa.com/checkbox-example/");

// Checking all the checkbox:
        List<WebElement> listOfCheckBoxes = driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
        System.out.println(listOfCheckBoxes.size());
        for (WebElement checkBox : listOfCheckBoxes) {
            checkBox.click();
        }
    }
}