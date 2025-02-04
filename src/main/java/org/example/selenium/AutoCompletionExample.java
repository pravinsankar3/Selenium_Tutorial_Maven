package org.example.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class AutoCompletionExample {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/auto-complete.php");

        WebElement inputBox = driver.findElement(By.id("tags"));
        inputBox.sendKeys("p");

        Thread.sleep(3000);
// get all the options in the dropdown
        List<WebElement> OptionList = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));

// prints the no of options in the dropdown list:
        System.out.println("Options shown after entering p: " + OptionList.size());

        for (WebElement webElement1 : OptionList) {
            if (webElement1.getText().equals("Python")) {
                webElement1.click();
                break;
            }
        }

    }
}
//*[@id="tags"]