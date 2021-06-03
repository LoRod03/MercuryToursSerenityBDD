package com.demo.guru99.automations.steps;

import com.demo.guru99.automations.models.Data;
import com.demo.guru99.automations.pageobjects.RegisterNewUser;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterNewUserStep {
    String successfulMessageStr = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
    RegisterNewUser registerNewUser = new RegisterNewUser();

    @Step
    public void fillContactInformationFields(Data data){
        registerNewUser.setFirstName(data.getFirstName());
        registerNewUser.setLastName(data.getLastName());
        registerNewUser.setPhoneNumber(data.getPhoneNumber());
        registerNewUser.setEmailAddress(data.getEmailAddress());
        registerNewUser.setUserName(data.getUsername());
        registerNewUser.setPassword(data.getPassword());
        registerNewUser.setConfirmPassword(data.getPassword());
        registerNewUser.sendInformation();
    }

    @Step
    public void successfulMessage(){
        Assert.assertEquals(successfulMessageStr, registerNewUser.successfulRegistrationMessage());
    }
}
