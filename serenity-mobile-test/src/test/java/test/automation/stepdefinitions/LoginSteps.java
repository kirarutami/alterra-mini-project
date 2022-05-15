package test.automation.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import test.automation.pages.HomeScreen;
import test.automation.pages.LoginScreen;


public class LoginSteps {
    @Steps
    LoginScreen loginScreen;
    @Steps
    HomeScreen homeScreen;

    @Given("android user on home page")
    public void androidUserOnLandingScreen() {
        boolean actual = homeScreen.onHomeScreen();
        Assert.assertTrue(actual);
    }

    @When("android user click on login icon")
    public void clickOnLoginIcon() {
        homeScreen.tapOnLoginIcon();
    }

    @And("android user input email")
    public void inputEmail() {
        loginScreen.inputEmail("sara@qealta.com");
    }

    @And("android user input password")
    public void inputPassword() {
        loginScreen.inputPassword("sara123");
    }

    @And("android user tap on login button")
    public void tapLoginButton(){
        loginScreen.tapLoginButton();
    }

    @Then("android user on home page after login")
    public void userOnLandingScreen() {
        boolean actual = homeScreen.onHomeScreen();
        Assert.assertTrue(actual);
    }
}
