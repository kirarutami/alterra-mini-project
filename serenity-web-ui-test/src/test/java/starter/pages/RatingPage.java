package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class RatingPage extends PageObject {
    private By detailButton(){
        return By.xpath("//*[@id=\"1577\"]/div/div[3]/div[2]/button[1]");
    }
    private By rating2Star(){
        return By.xpath("//*[@id=\"app\"]/div/main/div/div/div/div/div/div/div/button[2]");
    }
    private By stillOnDetail(){
        return By.xpath("//*[@class='v-chip v-chip--no-color theme--light v-size--default']");
    }
    @Step
    public void clickDetailButton(){
        $(detailButton()).click();
    }
    @Step
    public void click2StarRating(){
        $(rating2Star()).click();
    }
    @Step
    public void stillOnProductPage(){
        $(stillOnDetail()).isDisplayed();
    }
}
