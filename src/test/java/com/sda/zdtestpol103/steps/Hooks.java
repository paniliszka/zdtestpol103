package com.sda.zdtestpol103.steps;

import com.sda.zdtestpol103.WebDriverManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.jupiter.api.Test;

public class Hooks {
   @Before
    public void beforeScenario(Scenario scenario){
       System.out.println("This is Scenario name: " +scenario.getName());
       // This is a place to start browser
       WebDriverManager.startDriver();
   }
   @After
    public void afterScenario(Scenario scenario){
       System.out.println("This is Scenario name:" +scenario.isFailed());
       WebDriverManager.destroyDriver();

   }
}
