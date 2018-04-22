package stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.ChooseBrowser;
import utilities.PageObjects;

/**
 * Created by Srini on 22/04/2018.
 */
public class mystepdef extends PageObjects{


    ChooseBrowser browser = new ChooseBrowser();
    WebDriver driver = browser.getChromeDriver();

}
