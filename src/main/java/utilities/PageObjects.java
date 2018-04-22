package utilities;

import org.openqa.selenium.By;

/**
 * Created by Srini on 22/04/2018.
 */
public class PageObjects {
    public String home_url = "https://www.gov.uk/get-vehicle-information-from-dvla";
    public By startnow_button =  By.cssSelector("#get-started > a");
    public By enter_venicle_number = By.id("Vrm");
    public By continue_button = By.cssSelector("#content > form > div > div > div.form-group.no-bottom > fieldset > button");
    public By You_must_enter_your_registration_number_in_a_valid_format = By.cssSelector(" #Vrm-error");
    public By  Make = By.cssSelector("#pr3 > div > ul > li:nth-child(2) > span:nth-child(2) > strong");
    public By  Colour = By.cssSelector("#pr3 > div > ul > li:nth-child(3) > span:nth-child(2) > strong");
}
