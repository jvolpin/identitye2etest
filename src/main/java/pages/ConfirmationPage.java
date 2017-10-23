package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juan on 22/10/2017.
 */
public class ConfirmationPage extends Abstract {

    @FindBy(xpath = "//li[2]/span[2]/strong")
    private WebElement make;

    @FindBy(xpath = "//li[3]/span[2]/strong")
    private WebElement colour;

    public ConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public String getMake() {
        return make.getText();
    }

    public String getColour() {
        return colour.getText();
    }
}
