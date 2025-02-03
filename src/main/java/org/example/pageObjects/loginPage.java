package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class loginPage {

    @Test
    public void login(){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

        PageFactory.initElements(driver, pageObjectss.class);

        pageObjectss.username.sendKeys("student");
        pageObjectss.password.sendKeys("Password123");
        pageObjectss.submit.click();
    }
}
