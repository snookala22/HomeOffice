package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.ChooseBrowser;
import utilities.PageObjects;

/**
 * Created by Srini on 22/04/2018.
 */
public class mystepdef extends PageObjects{


    ChooseBrowser browser = new ChooseBrowser();
    WebDriver driver = browser.getChromeDriver();



    @Given("^I am on a vehicle enquires page$")
    public void i_am_on_a_vehicle_enquires_page() throws Throwable {
        driver.get(home_url);
    }

    @When("^I click on Start button to begin the enquiry$")
    public void i_click_on_Start_button_to_begin_the_enquiry() throws Throwable {
        driver.findElement(startnow_button).click();
        Thread.sleep(1000);
    }

    @When("^I enter the vehicle registration number and click on Continue button$")
    public void i_enter_the_vehicle_registration_number_and_click_on_Continue_button() throws Throwable {
       // driver.findElement(enter_venicle_number).sendKeys("LX17YKA");
        Thread.sleep(6000);
        driver.findElement(continue_button).click();
        Thread.sleep(6000);

    }

    @Then("^I see the vehicle details and validate$")
         public void i_see_the_vehicle_details_and_validate() throws Throwable {

        Thread.sleep(1000);

        try {
            Assert.assertFalse(driver.findElement(You_must_enter_your_registration_number_in_a_valid_format).isDisplayed());
        } catch (Exception e) {
        }
        Assert.assertEquals(driver.findElement(Colour).getText(), "RED");

        driver.navigate().back();
    }

}
