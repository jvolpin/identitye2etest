package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Juan on 22/10/2017.
 */
public class Abstract {

    protected WebDriver driver;
    public Abstract(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
