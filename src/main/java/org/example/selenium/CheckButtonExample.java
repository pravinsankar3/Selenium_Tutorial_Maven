package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckButtonExample {
    public static void main(String[] arg)
    {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.expandtesting.com/checkboxes");

        //1. Select the checkbox:
        WebElement selectCheckBox = driver.findElement(By.id("checkbox1"));
        selectCheckBox.click();

        //2. To check if the checkbox is selected
        WebElement checkCheckbox = driver.findElement(By.id("checkbox2"));
        Boolean CheckIfSelected = checkCheckbox.isSelected();
        System.out.println(CheckIfSelected);

        //3. DeSelect only the checked box:
        WebElement FirstElement = driver.findElement(By.id("checkbox1"));
        if (FirstElement.isSelected()){
            FirstElement.click();
        }

        WebElement SecondElement = driver.findElement(By.id("checkbox2"));
        if (SecondElement.isSelected()){
            SecondElement.click();
        }


    }
}
