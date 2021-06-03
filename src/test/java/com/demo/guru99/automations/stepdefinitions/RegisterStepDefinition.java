package com.demo.guru99.automations.stepdefinitions;

import com.demo.guru99.automations.models.Data;
import com.demo.guru99.automations.steps.HomePageStep;
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
    public void couldSeeTheWelcomeText() {
        registerNewUserStep.successfulMessage();

    }
}
