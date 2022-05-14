package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.OrderPage;

public class OrderSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    OrderPage orderPage;

    @Given("I am on the home page for order")
    public void onTheHomePage(){
        homePage.homePage();
        homePage.validateOnHomePage();
    }
    @When("I click on Beli button on a product")
    public void clickBeliButton(){
        orderPage.clickBeliButton();
    }
    @And ("I click on Cart button")
    public void clickCartIcon(){
        orderPage.clickCartIcon();
    }
    @And ("I click on Bayar button")
    public void clickBayarButton(){
        orderPage.clickBayarButton();
    }
    @Then("I am directed to Login page")
    public void validateOnLoginPage(){
        loginPage.validateOnLoginPage();
    }

    @Given("I am on the login page for order")
    public void onLoginPage(){
        loginPage.loginPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid email for order")
    public void inputValidEmail(){
        loginPage.inputEmail("sara@qealta.com");
    }
    @And("I input valid password for order")
    public void inputValidPassword(){
        loginPage.inputPassword("sara123");
    }
    @And("I click on login button for order")
    public void clickOnLoginButoon(){
        loginPage.clickLoginButton();
    }
    @Then("I am on the Transaction page")
    public void onTransactionPage(){
        orderPage.validateOnTransactionPage();
    }

    @And("I click on reduce button")
    public void clickReduceButton(){
        orderPage.clickReduceButton();
    }

    @Then("The order is empty message showed")
    public void orderEmptyAlertShowed(){
        orderPage.orderEmptyAlertShowed();
    }

}
