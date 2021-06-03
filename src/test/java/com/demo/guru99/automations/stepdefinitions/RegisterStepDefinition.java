package com.demo.guru99.automations.stepdefinitions;

import com.demo.guru99.automations.models.Data;
import com.demo.guru99.automations.steps.HomePageStep;
import com.demo.guru99.automations.steps.LoginSectionStep;
import com.demo.guru99.automations.steps.RegisterNewUserStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegisterStepDefinition {

    @Steps
    HomePageStep homePageStep;
    @Steps
    RegisterNewUserStep registerNewUserStep;
    @Steps
    LoginSectionStep loginSectionStep;

    @Given("^the user is on the registration page$")
    public void theUserIsOnTheRegistrationPage() {
        homePageStep.openBrowser();
        homePageStep.selectRegisterLink();
    }

    @When("^the user enters the personal information$")
    public void theUserEntersThePersonalInformation(List<Data> dataList) {
        registerNewUserStep.fillContactInformationFields(dataList.get(0));
    }

    @Then("^could see the welcome text$")
    public void couldSeeTheWelcomeText(List<Data> dataList) throws InterruptedException {
        registerNewUserStep.successfulMessage();
        loginSectionStep.getLoginPage();
        Thread.sleep(3000);
        loginSectionStep.signinMercuryTours(dataList.get(0));
        loginSectionStep.sendCredentials();
        loginSectionStep.compareSuccessMessage();
    }
}
