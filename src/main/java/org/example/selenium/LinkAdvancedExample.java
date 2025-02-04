package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinkAdvancedExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/links.php");
        WebDriver driver2 = new ChromeDriver();
        driver2.get("https://www.tutorialspoint.com/selenium/practice/broken-links.php");

        WebElement homeButton = driver.findElement(By.linkText("Home"));
        homeButton.click();

//      1. Goes to the previous web page:
        driver.navigate().back();

//      2. TO find where the page is navigated to on clicking:
        WebElement WhereToGo = driver.findElement(By.partialLinkText("Home"));
        String Where = WhereToGo.getAttribute("href");
        System.out.println("The link is navigating to " + Where);

//      3. Verify if a link is broken:
        WebElement Broken = driver2.findElement(By.linkText("Click Here for Broken Link"));
        Broken.click();
        String tabName = driver2.getTitle();
        if (tabName.contains("500")) {
            System.out.println("The link is broken");
        }
        driver2.navigate().back();

//      4. Count the no. of links:
        List<WebElement> noOfLinks = driver2.findElements(By.tagName("a"));
        int size = noOfLinks.size();
        System.out.println("No of links: " + size);

    }
}