package com.sda.zdtestpol103.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class authenStepdefs {
    @Given("Home page is open")
    public void homePageIsOpen() {
        System.out.println("Home page is open");
    }

    @When("I click on Sign In button")
    public void iClickOnSignInButton() {
        System.out.println("I click on Sign in");
    }


    @Then("Logon is successful")
    public void logonIsSuccessful() {
        System.out.println("Logged in");
    }

    @And("I type in logon credentials {string}")
    public void iTypeInLogonCredentials(String login) {
        System.out.println("User name is " +login);
    }

    @And("I type in password {string}")
    public void iTypeInPassword(String password) {
        System.out.println("Password is " +password);
    }

    @And("I type logon credentials {string}")
    public void iTypeLogonCredentials(String wrongLogin) {
        System.out.println("User is not an e-mail but " +wrongLogin);
    }

    @Then("Error message is presented")
    public void errorMessageIsPresented() {
        System.out.println("Well shit");
    }
}
