package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Juan on 22/10/2017.
 */
public class InsertPlatePage extends Abstract {
    @FindBy(id="Vrm")
    private WebElement plateTextBox;

    @FindBy(className = "button")
    private WebElement submitButton;

    public InsertPlatePage(WebDriver driver) {
        super(driver);
    }

    public InsertPlatePage completePlateTextBox(String plateNumber) {
        plateTextBox.sendKeys(plateNumber);
        return this;
    }

    public ConfirmationPage clickSubmitButton() {
        submitButton.click();
        return new ConfirmationPage(driver);
    }
}
