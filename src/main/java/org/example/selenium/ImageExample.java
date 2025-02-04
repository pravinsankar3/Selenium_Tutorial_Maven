package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice-automation.com/broken-images/");

//      1. clicks the image and navigates to home page
        WebElement image1 = driver.findElement(By.xpath("//*[@id=\"header\"]/div/a/img"));
        image1.click();
//      the page will stay in the homepage, so return back before next operation


//      2. Checks if the image is broken or not
        WebElement image2 = driver.findElement(By.xpath("//*[@id=\"post-1218\"]/div/div[1]/div/div[2]/img"));

//      if the natural width of the image is 0, image is broken
        if (image2.getAttribute("naturalWidth").equals("0")) {
            System.out.println("The image is broken");
        } else {
            System.out.println("The image is not broken");
        }
    }
}