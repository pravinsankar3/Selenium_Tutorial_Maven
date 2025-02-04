package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DropdownExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.Gecko.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");

        WebElement Dropdown1 = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div/div/div[2]/div/div/div/p/select"));
        Select select1 = new Select(Dropdown1);

//1. select the options from the dropdown:
        select1.selectByIndex(2);
        select1.selectByValue("DZA");
        select1.selectByVisibleText("Antigua and Barbuda");

//2. Get the total no. of options in Dropdown box
        List<WebElement> ListOfOptions = select1.getOptions();
        int Size = ListOfOptions.size();
        System.out.println(Size);

        Dropdown1.sendKeys("Antiqua and Barbuda");

    }
}