package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class webPageLinks {
    @Test
    public void printWebpageLinks() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");

        WebElement searchBar = driver.findElement(By.name("q"));
        searchBar.sendKeys("12 angry men" + Keys.ENTER);
        Thread.sleep(3000);

// Print all the links in the webpage:
        List<WebElement> links = driver.findElements(By.xpath("//a"));

        for (WebElement element : links) {
            System.out.println(element.getAttribute("href"));
        }
// Print all the green links in the webpage:
        List<WebElement> greenLinks = driver.findElements(By.xpath("//*[@id='search']//cite"));
        for (WebElement mainLink : greenLinks) {
            System.out.println(mainLink.getText());
        }

    }
}