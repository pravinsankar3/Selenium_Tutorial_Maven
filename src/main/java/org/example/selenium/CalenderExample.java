package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");

//      Select the Date using code
        WebElement CalendarInputBox = driver.findElement(By.id("datetimepicker1"));
        CalendarInputBox.click();

        Thread.sleep(3000);

        WebElement YearButton = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/span[1]"));
        YearButton.click();
        YearButton.click();

        WebElement MonthButton = driver.findElement(By.xpath("//select[@aria-label='Month']"));

        Select MonthOption = new Select(MonthButton);
//        int Monthsize = MonthOption.getOptions().size();
//        System.out.println(Monthsize);
        MonthOption.selectByIndex(4);

        WebElement DateButton = driver.findElement(By.xpath("//span[contains(text(),'12')]"));
        DateButton.click();

        WebElement HourButton = driver.findElement(By.xpath("//input[@aria-label=\"Hour\"]"));
        HourButton.sendKeys("15");

        WebElement MinuteButton = driver.findElement(By.xpath("//input[@aria-label=\"Minute\"]"));
        MinuteButton.sendKeys("15" + Keys.ENTER);
    }
}