package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By TombolBeli(){
        return By.xpath("//*[@class='button-beli ml-3 v-btn v-btn--outlined theme--light v-size--small primary--text']");
    }
    @Step
    public void validateOnHomePage(){
        $(TombolBeli()).isDisplayed();
    }
    @Step
    public void homePage() {
        openAt("/");
    }

//    private By TombolLogin(){
//        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div[2]/form/div[3]/button");
//    }
//    @Step
//    public void validateOnLoginPage() { $(TombolLogin()).isDisplayed()}
}
