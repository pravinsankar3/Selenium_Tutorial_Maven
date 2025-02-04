package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenGoogleEdge {
    public static void main(String[] args){
        System.setProperty("webdriver.Edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\edgedriver_win64\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.google.com");
    }
}
