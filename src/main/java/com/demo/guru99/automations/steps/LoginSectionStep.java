package com.demo.guru99.automations.steps;

import com.demo.guru99.automations.models.Data;
import com.demo.guru99.automations.pageobjects.LoginSection;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSectionStep {
    LoginSection loginSection = new LoginSection();

    @Step
    public void getLoginPage(){
        loginSection.signinLinkClick();
    }

    @Step
    public void signinMercuryTours(Data data){
        loginSection.setUserNameSigninSection(data.getUsername());
        loginSection.setPasswordSigninSection(data.getPassword());
    }

    @Step
    public void sendCredentials(){
        loginSection.submitClick();
    }

    @Step
    public void compareSuccessMessage(){
        Assert.assertEquals("Thank you for Loggin.", loginSection.loginSuccessfullyMessage());
    }
}
