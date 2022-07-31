package com.sda.zdtestpol103.steps;

import com.sda.zdtestpol103.pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleStepdefs {
    GooglePage googlePage = new GooglePage();
    @Given("Google page is open")
    public void googlePageIsOpen() {
        googlePage.openGooglePage();

    }

    @When("I click Accept all button")
    public void iClickAcceptAllButton() {
        googlePage.clickAcceptAllButton();
    }

    @And("I search for phrase {string}")
    public void iSearchForPhrase(String searchPhrase) {
        googlePage.searchInGoogle(searchPhrase);

    }

    @Then("I can see search results page")
    public void iCanSeeSearchResultsPage() {
        System.out.println("I can see results");
    }

    @And("I click Enter button")
    public void iClickEnterButton() {
        System.out.println("I click Enter button");
    }

    @Then("Search result is not presented")
    public void searchResultIsNotPresented() {
        System.out.println("Search result is not there");
    }
}
