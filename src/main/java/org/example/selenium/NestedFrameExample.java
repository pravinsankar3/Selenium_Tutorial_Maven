package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class NestedFrameExample {
    public static void main(String[] args){
        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.dezlearn.com/nested-iframes-example/");

        driver.switchTo().frame(0);
        driver.switchTo().frame("iframe1");
        WebElement clickButton = driver.findElement(By.xpath("//*[@id=\"u_5_6\"]"));
        clickButton.click();

        driver.switchTo().defaultContent();
    //  used to return to the original content

    //  To count the no of Frames in the window:
        List<WebElement> NoOfIframes = driver.findElements(By.tagName("iframe"));
        int FrameCount = NoOfIframes.size();
        System.out.println(FrameCount);

}
}