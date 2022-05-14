package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;
import starter.pages.RatingPage;

public class RatingSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Steps
    RatingPage ratingPage;

    @Given("I am on the login page for rating")
    public void onTheLoginPage(){
        loginPage.loginPage();
        loginPage.validateOnLoginPage();
    }
    @When("I input valid email for rating")
    public void inputValidEmail(){
        loginPage.inputEmail("sara@qealta.com");
    }
    @And("I input valid password for rating")
    public void inputValidPassword(){
        loginPage.inputPassword("sara123");
    }
    @And("I click on login button for rating")
    public void clickLoginButton(){
        loginPage.clickLoginButton();
    }
    @And("I am on the home page for rating")
    public void onTheHomePage(){
        homePage.validateOnHomePage();
    }
    @And("I click Detail button on a product for rating")
    public void clickDetailButton(){
        ratingPage.clickDetailButton();
    }
    @And("I click star icon for rating")
    public void clickStarIcon(){
    ratingPage.click2StarRating();
    }
    @Then("I am still on Product Page")
    public void stillOnProductPage(){
        ratingPage.stillOnProductPage();
    }


}
