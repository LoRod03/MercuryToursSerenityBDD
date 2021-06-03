package com.demo.guru99.automations.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register.feature",
        glue = "com.demo.guru99.automations.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class RegisterRunner {
}
