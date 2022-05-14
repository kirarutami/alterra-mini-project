package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class OrderPage extends PageObject {
    private By emailFields(){
        return By.xpath("//*[label[text()='Email']]/input");

    }
    private By passwordFields(){
        return By.xpath("//*[label[text()='Password']]/input");
    }

    private By loginButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
    }

    private By transactionPage(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/h1");
    }

    private By beliButton(){
        return By.xpath("//*[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }

    private By cartIcon(){
        return By.xpath("//*[@class='v-icon notranslate fas fa-shopping-cart theme--dark']");
    }
    private By bayarButton(){
        return By.xpath("//*[@class='v-btn v-btn--is-elevated v-btn--has-bg theme--light v-size--large primary']");
    }
    private By reduceButton(){
        return By.xpath("//*[@class='v-btn v-btn--icon v-btn--outlined v-btn--round theme--light v-size--default']");
    }
    private By orderEmptyAlert(){
        return By.xpath("//*[@class='v-alert v-sheet theme--light elevation-2 v-alert--border v-alert--border-top']");
    }

    @Step
    public void loginPage() {
        openAt("/auth/login");
    }

    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void inputEmail(String email){
        $(emailFields()).type(email);
    }

    @Step
    public void inputPassword(String password){
        $(passwordFields()).type(password);
    }

    @Step
    public void clickLoginButton(){
        $(loginButton()).click();
    }

    @Step
    public boolean validateStillOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }

    @Step
    public boolean validateOnTransactionPage(){
        return $(transactionPage()).isDisplayed();
    }

    @Step
    public void clickBeliButton() {
        $(beliButton()).click();
    }

    @Step
    public void clickCartIcon(){
        $(cartIcon()).click();
    }
    @Step
    public void clickBayarButton(){
        $(bayarButton()).click();
    }
    @Step
    public void clickReduceButton(){
        $(reduceButton()).click();
    }
    @Step
    public void orderEmptyAlertShowed(){
        $(orderEmptyAlert()).click();
    }
}
