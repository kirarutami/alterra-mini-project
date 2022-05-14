package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.RegisterPage;

public class RegisterSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    RegisterPage registerPage;

    @Given("I am on the register page")
    public void onTheRegisterPage() {
        registerPage.registerPage();
        registerPage.validateOnRegisterPage();
    }

    @When("I input valid full name")
    public void inputValidFullName() {
        registerPage.inputNamaLengkap("Sara Lutami Pardede");
    }

    @When("I input valid full name that already registered")
    public void inputValidRegisteredFullName() {
        registerPage.inputNamaLengkap("Sara Lutami Pardede");
    }

    @And("I input valid email for register")
    public void inputValidEmail() {
        loginPage.inputEmail("saraaaaaaaaaaaa@qealta.com");
    }
    @And("I input valid email that already registered")
    public void inputValidRegisteredEmail() {
        loginPage.inputEmail("sara@qealta.com");
    }

    @And("I input valid password for register")
    public void inputValidPassword() {
        loginPage.inputPassword("sara123");
    }

    @And("I input invalid password with space")
    public void inputInvalidPasswordWithSpace() {
        loginPage.inputPassword("sara 123");
    }

    @And("I click on register button")
    public void clickRegisterButton() {
        registerPage.clickRegisterButton();
    }

    @Then("I am on the login page after register")
    public void onTheHomePage() {
        loginPage.loginPage();
        loginPage.validateOnLoginPage();
    }

    @Then("I am still on the register page")
    public void stillOnTheRegisterPage() {
        registerPage.registerPage();
        registerPage.validateStillOnRegisterPage();
    }
}