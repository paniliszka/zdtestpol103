package com.sda.zdtestpol103.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstStepdefs {
    @Given("This is given")
    public void thisIsGiven() {
        System.out.println("We are inside Given step");

    }

    @When("This is when")
    public void thisIsWhen() {
        System.out.println("We are inside When step");
        
    }

    @Then("This is then")
    public void thisIsThen() {
        System.out.println("We are inside Then step");
    }
}
