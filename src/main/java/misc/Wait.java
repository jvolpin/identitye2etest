package misc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Juan on 23/10/2017.
 */
public class Wait extends WebDriverWait {

    public Wait(WebDriver driver, long timeOutInSeconds) {
        super(driver, timeOutInSeconds);
    }
}
