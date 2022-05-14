package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RegisterPage extends PageObject {

    private By namaLengkapFields(){
        return By.xpath("//*[label[text()='Nama Lengkap']]/input");
    }
    private By emailFields(){ return By.xpath("//*[label[text()='Email']]/input"); }
    private By passwordFields(){
        return By.xpath("//*[label[text()='Password']]/input");
    }
    private By registerButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[4]/button");
    }
    private By loginButton(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
    }
    @Step
    public void registerPage() {
        openAt("/auth/register");
    }

    @Step
    public boolean validateOnRegisterPage(){
        return $(registerButton()).isDisplayed();
    }

    @Step
    public void inputNamaLengkap (String namaLengkap){
        $(namaLengkapFields()).type(namaLengkap);
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
    public void clickRegisterButton(){
        $(registerButton()).click();
    }

    @Step
    public boolean validateStillOnRegisterPage(){
        return $(registerButton()).isDisplayed();
    }
    @Step
    public boolean validateOnLoginPage(){
        return $(loginButton()).isDisplayed();
    }
}
