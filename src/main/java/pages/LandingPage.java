package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juan on 22/10/2017.
 */
public class LandingPage extends Abstract {
    @FindBy(className = "button")
    private WebElement startButton;

    public LandingPage(WebDriver driver) {
        super(driver);
    }

    public InsertPlatePage clickGetStarted(){
        startButton.click();
        return new InsertPlatePage(driver);
    }
}
