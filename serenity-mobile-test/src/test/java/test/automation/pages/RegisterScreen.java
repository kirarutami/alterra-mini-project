//package test.automation.pages;
//
//import io.appium.java_client.MobileBy;
//import net.thucydides.core.annotations.Step;
//import org.openqa.selenium.By;
//import test.automation.pageobject.BasePageObject;
//
//public class RegisterScreen extends BasePageObject {
//
//    private By registerText(){
//        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
//    }
//    private By registerPage(){
//        return MobileBy.xpath("//android.view.View[@content-desc=\"Register\"]");
//    }
//
//    @Step
//    public void tapRegisterText(){
//        onClick(registerText());
//    }
//
//    @Step
//    public boolean onRegisterPage(){
//        return waitUntilPresence(registerPage()).isDisplayed();
//    }
//}
