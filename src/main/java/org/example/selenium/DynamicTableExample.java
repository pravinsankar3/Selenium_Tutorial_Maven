package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.*;

public class DynamicTableExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://practice.expandtesting.com/tables");

// 1. Get the no of Rows & Columns in the Web table:
        List<WebElement> noOfColumns = driver.findElements(By.tagName("th"));
        int columns = noOfColumns.size();
        System.out.println("No of Columns: "+columns);

        List<WebElement> noOfRows = driver.findElements(By.tagName("tr"));
        int rows = noOfRows.size();
        System.out.println("No of Rows: "+ rows);

// 2. Print the following cell data:
        WebElement getPercentage = driver.findElement(By.xpath("//td[text()='Smith']/following::td[3]"));
        System.out.println("The amount following the Smith is: "+getPercentage.getText().replace("$",""));

// 3. Print the smallest percentage from the table:
        List<WebElement> allPercentages = driver.findElements(By.xpath("//td[4]"));
        List<Float> NumberList = new ArrayList<Float>();

        for (WebElement webelement: allPercentages)
        {
            String individualElement = webelement.getText().replace("$","");
            NumberList.add(Float.parseFloat(individualElement));
        }

        System.out.println("Final List: "+NumberList);
        Float smallestAmount = Collections.min(NumberList);
        System.out.println("The smallest amount is: "+smallestAmount);

        String FinalXpath = "//td[text()='"+"$"+smallestAmount+"0']/following::td[1]";
        System.out.println("The email of the smallest amount is: "+FinalXpath);
        WebElement clickEdit = driver.findElement(By.xpath(FinalXpath));
        String text = clickEdit.getText();
        System.out.println(text);
    }
}