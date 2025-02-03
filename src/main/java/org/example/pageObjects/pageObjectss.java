package org.example.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class pageObjectss {

    @FindBy(id = "username")
    public static WebElement username;

    @FindBy(id = "password")
    public static WebElement password;

    @FindBy(id = "submit")
    public static WebElement submit;

}
