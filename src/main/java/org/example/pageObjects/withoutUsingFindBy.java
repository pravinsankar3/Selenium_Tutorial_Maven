package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class withoutUsingFindBy {

public static WebElement username;
public static WebElement password;
public static WebElement submit;

    @Test
    public void login(){
        System.setProperty("webdriver.edge.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        PageFactory.initElements(driver, withoutUsingFindBy.class);

        username.sendKeys("student");
        password.sendKeys("Password123");
        submit.click();
    }
}
