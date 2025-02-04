package org.example.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {
    public static  void main(String[] args)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/buttons.php");

//1. Get the location of the button
        WebElement ButtonPosition = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]"));
        Point XYPoint = ButtonPosition.getLocation();
        int XPoint = XYPoint.getX();
        int YPoint = XYPoint.getY();
        System.out.println("X Point: "+XPoint+", Y Point: "+YPoint);

//2. Get the color of the button
        WebElement ColourButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]"));
        String color = ColourButton.getCssValue("background-color");
        System.out.println(color);

//3. Get the size of the button
        WebElement SizeButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/button[3]"));
        int height = SizeButton.getSize().getHeight();
        int width = SizeButton.getSize().getWidth();
        System.out.println("Height: "+ height+", Width: "+width);

        driver.quit();
    }
}