package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.LogoutPage;

public class LogoutSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    LogoutPage logoutPage;

    @Given("I am on the login page for logout")
    public void onTheLoginPage(){
        loginPage.loginPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid email for logout")
    public void inputValidEmail(){
        loginPage.inputEmail("sara@qealta.com");
    }
    @And("I input valid password for logout")
    public void inputValidPassword(){
        loginPage.inputPassword("sara123");
    }
    @And("I click on login button for logout")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @And("I am on the home page for logout")
    public void onTheHomePage(){
        homePage.validateOnHomePage();
    }

    @And("I click on profile icon")
    public void clickProfileIcon(){
        logoutPage.clickProfileIcon();
    }
    @And("I click on logout")
    public void clickLogout(){
        logoutPage.clickLogout();
    }
    @Then("I am on login page after logout")
    public void onLoginPageAfterLogout(){
        loginPage.validateStillOnLoginPage();
    }


}
