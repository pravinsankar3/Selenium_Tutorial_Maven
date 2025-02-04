package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RadioButtonExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");

        WebElement uncheckedButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input"));
        WebElement checkButton = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[3]/input"));

        Boolean status1 = uncheckedButton.isSelected();
        Boolean status2 = checkButton.isSelected();

        System.out.println(status1);
        System.out.println(status2);

//2. click the Radio button
        WebElement ClickYes = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[1]/input"));
        ClickYes.click();

    }
}
