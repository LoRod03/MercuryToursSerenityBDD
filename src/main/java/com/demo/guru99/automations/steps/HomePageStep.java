package com.demo.guru99.automations.steps;

import com.demo.guru99.automations.pageobjects.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.UsePersistantStepLibraries;

public class HomePageStep {
    HomePage homePage = new HomePage();
    @Step
    public void openBrowser(){
        homePage.open();
    }

    @Step
    public void selectRegisterLink(){
        homePage.clicRegisterLink();
    }
}
