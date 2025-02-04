package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class SelectableExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/selectable.php");

//   1. To get the no. of options in the selectable in a list:
        List<WebElement> ListOfSelectables = driver.findElements(By.xpath("//*[@id=\"nav-home\"]/ul/li"));

        int size = ListOfSelectables.size();
        System.out.println("No of Selectables: " + size);

//   2. To select the Selectables:
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.CONTROL)
                .click(ListOfSelectables.get(0))
                .click(ListOfSelectables.get(1))
                .click(ListOfSelectables.get(2)).build().perform();

/*      Alternative way:
        Actions actions = new Actions(driver);
        actions.clickAndHold(ListOfSelectables.get(0));
        actions.clickAndHold(ListOfSelectables.get(1));
        actions.clickAndHold(ListOfSelectables.get(2));
        actions.build().perform(); */

    }
}