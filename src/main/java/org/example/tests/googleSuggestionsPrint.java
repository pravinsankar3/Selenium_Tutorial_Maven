package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class googleSuggestionsPrint {
    @Test
    public void printGoogleSuggestions() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("agni");
        Thread.sleep(2000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
        for (WebElement webelement: list){
            System.out.println(webelement.getText());
        }
    }
}
