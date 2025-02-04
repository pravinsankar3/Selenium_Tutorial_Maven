package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextboxExamples {
        public static void main(String[] args){
            System.setProperty("webdriver.Gecko.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://practicetestautomation.com/practice-test-login/");

            WebElement username = driver.findElement(By.id("username"));
            username.sendKeys("student");

            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("Password123");

            WebElement submit = driver.findElement(By.id("submit"));
            submit.click();
        }
    }