package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DragAndDropExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");

        WebElement From = driver.findElement(By.id("draggable"));
        WebElement To = driver.findElement(By.id("droppable"));

        Actions actions = new Actions(driver);

        actions.clickAndHold(From).moveToElement(To).release(To).build().perform();

//      actions.dragAndDrop(From, To).build().perform();
    }
}