package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SortableExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://jqueryui.com/sortable/");

        driver.switchTo().frame(0);

//      1. Drag an element and change the position of the element:
        List<WebElement> ListOfSortables = driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));

        WebElement FromElement = ListOfSortables.get(6);
        WebElement ToElement = ListOfSortables.get(0);

        Actions actions = new Actions(driver);
        actions.clickAndHold(FromElement);
        actions.moveToElement(ToElement);
        actions.release();
        actions.build().perform();

    }
}
