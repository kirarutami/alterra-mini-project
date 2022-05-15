package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onTheLoginPage(){
        loginPage.loginPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid email")
    public void inputValidEmail(){
        loginPage.inputEmail("sara@qealta.com");
    }
    @And("I input valid password")
    public void inputValidPassword(){
        loginPage.inputPassword("sara123");
    }
    @And("I click on login button")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @Then("I am on the home page")
    public void onTheHomePage(){
        homePage.validateOnHomePage();
    }
    @And("I input invalid password")
    public void inputInvalidPassword() {
        loginPage.inputPassword("sara1233");
    }
    @Then("I am still on the login page")
    public void stillOnTheLoginPage(){
        loginPage.loginPage();
        loginPage.validateStillOnLoginPage();
    }
    @When("I input invalid email")
    public void inputInvalidEmail(){
        loginPage.inputEmail("sara@qaalta.com");
    }

    }
