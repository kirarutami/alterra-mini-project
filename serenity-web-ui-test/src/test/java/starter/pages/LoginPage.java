package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    private By emailFields(){
        return By.xpath("//*[label[text()='Email']]/input");

    }
    private By passwordFields(){
        return By.xpath("//*[label[text()='Password']]/input");
    }

    private By loginButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
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
}
