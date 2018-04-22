package example.belly.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import example.belly.Belly;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BellyStepDefinitions {

    private Belly belly;
    private int waitingTime;

    //ALL METHODS below are glued to FEATURES available within belly.feature
    @Given("^I have (\\d+) cukes in my belly$")
    public void i_have_cukes_in_my_belly(int cukes)
    {
        belly = new Belly();
        belly.eat(cukes);
    }

    @When("^I wait (\\d+) hour$")
    public void i_wait_hour(int waitingTime)
    {
        this.waitingTime = waitingTime;
    }

    @Then("^my belly should (.*)$")
    public void my_belly_should_growl(String expectedSound)
    {
        String actualSound = belly.getSound(waitingTime);
        assertThat(actualSound, is(expectedSound));
    }

}
