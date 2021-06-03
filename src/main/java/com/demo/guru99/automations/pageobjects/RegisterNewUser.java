package com.demo.guru99.automations.pageobjects;

import com.demo.guru99.automations.models.Data;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterNewUser extends PageObject {

    By firstNameInputLocator = By.xpath("//input[@name='firstName']");
    By lastNameInputLocator = By.xpath("//input[@name='lastName']");
    By phoneNumberInputLocator = By.xpath("//input[@name='phone']");
    By emailAddressInputLocator = By.id("userName");

    By userNameInputLocator = By.id("email");
    By passwordInputLocator = By.xpath("//input[@name='password']");
    By confirmPasswordInputLocator = By.xpath("//input[@name='confirmPassword']");

    By submitButtonLocator = By.xpath("//input[@name='submit']");

    /*
    By addressInputLocator = By.xpath("//input[@name='address1']");
    By cityInputLocator = By.xpath("//input[@name='city']");
    By provinceInputLocator = By.xpath("//input[@name='state']");
    By postalCodeInputLocator = By.xpath("//input[@name='postalCode']");
    By countrySelectLocator = By.xpath("//select[@name='country']");
    */
    /*
    public void setMailingInformation(){
        getDriver().findElement(addressInputLocator).sendKeys();
        getDriver().findElement(cityInputLocator).sendKeys();
        getDriver().findElement(provinceInputLocator).sendKeys();
        getDriver().findElement(postalCodeInputLocator).sendKeys();
        //
        getDriver().findElement(countrySelectLocator).sendKeys();
    }
    */

    public void setFirstName(String firstName){
        getDriver().findElement(firstNameInputLocator).sendKeys(firstName);
    }

    public void setLastName(String lastName){
        getDriver().findElement(lastNameInputLocator).sendKeys(lastName);
    }

    public void setPhoneNumber(String phoneNumber){
        getDriver().findElement(phoneNumberInputLocator).sendKeys(phoneNumber);
    }

    public void setEmailAddress(String emailAddress){
        getDriver().findElement(emailAddressInputLocator).sendKeys(emailAddress);
    }

    public void setUserName(String userName){
        getDriver().findElement(userNameInputLocator).sendKeys(userName);
    }

    public void setPassword(String password){
        getDriver().findElement(passwordInputLocator).sendKeys(password);
    }

    public void setConfirmPassword(String confirmPassword){
        getDriver().findElement(confirmPasswordInputLocator).sendKeys(confirmPassword);
    }

    public void sendInformation(){
        getDriver().findElement(submitButtonLocator).click();
    }

    public String successfulRegistrationMessage(){
        List<WebElement> fonts = getDriver().findElements(By.tagName("font"));
        return fonts.get(4).getText();
    }
}
