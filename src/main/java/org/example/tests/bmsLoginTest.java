package org.example.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class bmsLoginTest {

    @Test
    public void bmsTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PRAVINR\\Downloads\\Web Drivers\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.bookmyshow.com");

        driver.manage().window().maximize();

        String OldWindow = driver.getWindowHandle();

        WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement chennaiButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=\"Chennai\"]")));
        chennaiButton.click();

        WebElement searchBar = driver.findElement(By.xpath("//*[@id=4]"));

//        WebElement jokerMovie = driver.findElement(By.xpath("//img[@src=\"https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:w-400.0,h-660.0,cm-pad_resize,bg-000000,fo-top:l-image,i-discovery-catalog@@icons@@like_202006280402.png,lx-24,ly-617,w-29,l-end:l-text,ie-NjUuM0sgTGlrZXM%3D,fs-29,co-FFFFFF,ly-612,lx-70,pa-8_0_0_0,l-end/et00352820-qzpmggkprk-portrait.jpg\"]"));
        WebElement jokerMovie =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src=\"https://assets-in.bmscdn.com/discovery-catalog/events/tr:w-400,h-600,bg-CCCCCC:w-400.0,h-660.0,cm-pad_resize,bg-000000,fo-top:l-image,i-discovery-catalog@@icons@@like_202006280402.png,lx-24,ly-617,w-29,l-end:l-text,ie-NjUuM0sgTGlrZXM%3D,fs-29,co-FFFFFF,ly-612,lx-70,pa-8_0_0_0,l-end/et00352820-qzpmggkprk-portrait.jpg\"]")));
        jokerMovie.click();

        WebElement signIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()=\"Sign in\"]")));
        signIn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("//img[@src=\"//in.bmscdn.com/webin/common/icons/googlelogo.svg\"]"))));
        WebElement googleSignIn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src=\"//in.bmscdn.com/webin/common/icons/googlelogo.svg\"]")));
        System.out.println("Google Sign in button is displayed: "+googleSignIn.isDisplayed());
        googleSignIn.click();

        Set<String> handles =  driver.getWindowHandles();

        for(String newHandles: handles){
            driver.switchTo().window(newHandles);
        }

        WebElement inputEmailBox = driver.findElement(By.xpath("//input[@aria-label=\"Email or phone\"]"));;
        inputEmailBox.sendKeys("pravinchamp98@gmail.com"+ Keys.ENTER);
    }
}
