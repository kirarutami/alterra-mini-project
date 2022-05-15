package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;

public class HomeScreen extends BasePageObject{

    private By loginIcon(){
        return MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button");
    }
    private By homeScreen(){
        return MobileBy.xpath("//android.view.View[@content-desc=\"Products\"]");
    }
    private By beliButton(){
        return MobileBy.xpath("(//android.widget.Button[@content-desc=\"Beli\"])[1]");
    }
    private By cartIcon(){
        return MobileBy.xpath("//android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button");
    }

    @Step
    public boolean onHomeScreen(){
        return waitUntilPresence(homeScreen()).isDisplayed();
    }
    @Step
    public void tapOnLoginIcon(){
        onClick(loginIcon());
    }
    @Step
    public void tapBeliButton(){
        onClick(beliButton());
    }
    @Step
    public void tapCartIcon(){
        onClick(cartIcon());
    }
}
