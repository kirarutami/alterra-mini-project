package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomeScreen;

public class BeliSteps {
    @Steps
    HomeScreen homeScreen;

    @Given("android user on home page for buy")
    public void androidUserOnLandingScreen() {
        boolean actual = homeScreen.onHomeScreen();
        Assert.assertTrue(actual);
    }

    @When("android user tap on Beli button")
    public void tapBeliButton(){
        homeScreen.tapBeliButton();
    }

    @And("android user tap on Cart icon")
    public void tapCartIcon(){
        homeScreen.tapCartIcon();
    }

    @Then("android user still on home page")
        public void stayOnHomePage() {
            boolean actual = homeScreen.onHomeScreen();
            Assert.assertTrue(actual);
    }


}
