package com.demo.guru99.automations.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginSection extends PageObject {
    By signinLinkLocator = By.xpath("//a[@href='login.php']");

    By userName = By.xpath("//input[@name='userName']");
    By password = By.xpath("//input[@name='password']");
    By submitButton = By.xpath("//input[@name='submit']");

    public void signinLinkClick(){
        getDriver().findElement(signinLinkLocator).click();
    }

    public void setUserNameSigninSection(String userNameSignin){
        getDriver().findElement(userName).sendKeys(userNameSignin);
    }

    public void setPasswordSigninSection(String passwordSignin){
        getDriver().findElement(password).sendKeys(passwordSignin);
    }

    public void submitClick(){
        getDriver().findElement(submitButton).click();
    }

}
