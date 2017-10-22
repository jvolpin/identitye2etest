import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Juan on 22/10/2017.
 */
@CucumberOptions(features="src/test/resources/features/")
@RunWith(Cucumber.class)
public class RunCukesTest{
}
