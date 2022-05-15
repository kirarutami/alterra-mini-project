package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class LogoutPage extends PageObject {
    private By profileIcon(){
        return By.xpath("//*[@class='v-icon notranslate fas fa-user theme--dark']");
    }
    private By logoutText(){
        return By.xpath(("//*[@class='v-icon notranslate fas fa-sign-in theme--light']"));
    }

    @Step
    public void clickProfileIcon(){
        $(profileIcon()).click();
    }

    @Step
    public void clickLogout(){
        $(logoutText()).click();
    }

}
