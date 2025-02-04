package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import javax.tools.Tool;

public class ToolTipExample {
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/tool-tips.php");

        WebElement ToolTip = driver.findElement(By.xpath("//a[@href=\"/selenium/index.htm\"]"));

        String ToolTipText = ToolTip.getAttribute("title");
        System.out.println(ToolTipText);
    }
}