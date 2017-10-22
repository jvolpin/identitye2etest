import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Created by Juan on 22/10/2017.
 */
public class Identitye2eTestSteps {
    // we shouldn't have this hard-coded here, but as it is a code test I think it's OK
    private static final String URL = "http://hotel-test.equalexperts.io/";
    // this is also here for simplicity - it could be in a Serenity session if needed to be shared among steps files
    private WebDriver driver;
    @Before
    public void setUp() {
        // I will keep things simple and assume we only care about Chrome
        driver = new ChromeDriver();
    }
    @After
    public void tearDown() {
        if (null != driver) {
            driver.quit();
        }
    }
    @Given("^the user has a valid spreadsheet with a valid plate number$")
    public void readSpreadsheet(){
        DirectoryScanner ds = new DirectoryScanner();
        DataFilter df = new DataFilter();
        String location = "D:\\workspace\\test";
        Path file = df.filterSheets(ds.listFilesForFolder(location));
        String line = "";
        String cvsSplitBy = ",";
        try (BufferedReader br = new BufferedReader(new FileReader(file.toFile()))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] plates = line.split(cvsSplitBy);

                System.out.println("Plate number= " + plates[0] + ", Make=" + plates[1] + ", Colour=" + plates[2]);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @When("^the user consults the provided URL$")
    public void the_user_consults_the_provided_URL(){
        driver.get(URL);

    }
    @Then("^the correct make and color details should be displayed$")
    public void the_correct_make_and_color_details_should_be_displayed(){

    }
}
