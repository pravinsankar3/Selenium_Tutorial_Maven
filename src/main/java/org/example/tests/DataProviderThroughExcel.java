package org.example.tests;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

public class DataProviderThroughExcel {

// Getting data through Excel with DataProvider
    /*@DataProvider(name = "loginCreds2")
    public String[][] getExcelData2() throws IOException, BiffException {
        FileInputStream excelPath = new FileInputStream("C:\\Users\\PRAVINR\\Downloads\\excelDataForLogin2.xls");
        Workbook workbook = Workbook.getWorkbook(excelPath);
        Sheet sheet = workbook.getSheet(0);
        int rowCount2 = sheet.getRows();
        int columnCount2 = sheet.getColumns();
        String[][] testData2 = new String[rowCount2 - 1][columnCount2];
        
// Iterating through the tables in Excel
        for (int i = 1; i < rowCount2; i++) {
            for (int j = 0; j < columnCount2; j++) {
                testData2[i - 1][j] = sheet.getCell(j, i).getContents();
            }
        }
        return testData2;
    }*/

    @DataProvider(name = "loginCred3")
    public String[][] login() throws IOException, BiffException {
        FileInputStream excelPath = new FileInputStream("C:\\Users\\PRAVINR\\Downloads\\excelDataForLogin2.xls");
        Workbook workbook = Workbook.getWorkbook(excelPath);
        Sheet sheet = workbook.getSheet(0);
        int rowCount = sheet.getRows();
        int columnCount = sheet.getColumns();

        String[][] testcase3 = new String[rowCount][columnCount];

        for (int i = 1; i < rowCount; i++) {
            for (int j = 0; j < columnCount; j++) {
                testcase3[i - 1][j] = sheet.getCell(j, i).getContents();
            }
        }
        return testcase3;
    }

    @Test(dataProvider = "loginCred3")
    public void logIn(String uName, String pWord) {

        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://practicetestautomation.com/practice-test-login/");

// Scrolling webpage:
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,450)", "");

        WebElement userName = driver.findElement(By.id("username"));
        userName.sendKeys(uName);

        WebElement passWord = driver.findElement(By.id("password"));
        passWord.sendKeys(pWord);

// Explicit wait applied:
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("submit"))));
        submitButton.click();
    }
}