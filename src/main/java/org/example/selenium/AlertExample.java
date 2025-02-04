package org.example.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class AlertExample {
    public static void main(String[] args){

        System.setProperty("webdriver.edge.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

        //1. Accept an alert box
        WebElement AlertBox1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[1]/button"));
        AlertBox1.click();

        Alert alert1 = driver.switchTo().alert();
        alert1.accept();

        //2. Dismiss the alert box
        WebElement Alertbox2 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[3]/button"));
        Alertbox2.click();

        Alert alert2 = driver.switchTo().alert();
        alert2.dismiss();

        //3. Enter text in Prompt box
        WebElement Promptbox1 = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/div[4]/button"));
        Promptbox1.click();

        Alert Prompt1 = driver.switchTo().alert();
        Prompt1.sendKeys("Darjling");
        Prompt1.accept();

        driver.quit();
    }
}