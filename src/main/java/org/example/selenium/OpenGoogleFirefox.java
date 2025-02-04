package org.example.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleFirefox {
    public static void main(String[] args){
        System.setProperty("webdriver.Gecko.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }
}
