package com.demo.guru99.automations.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginSection extends PageObject {
    By userName = By.xpath("//input[@name='userName']");
    By password = By.xpath("//input[@name='password']");
    By submitButton = By.xpath("//input[@name='submit']");

    public void putCredentials(){
        getDriver().findElement(userName).sendKeys();
        getDriver().findElement(password).sendKeys();
        getDriver().findElement(submitButton).click();
    }
}
