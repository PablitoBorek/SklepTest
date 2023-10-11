package StepDefinition;

import SklepTest.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("Browser is open")
    public void browser_is_open() {
        homePage.openHomePage();
    }

    @Then("I am on the main site")
    public void i_am_on_the_main_site() {
        String homePageName = homePage.getHomepageName();
        Assertions.assertEquals("Generic Shop", homePageName);
    }

    @When("I click account Button")
    public void iClickAccountButton() {
        homePage.clickAccountButton();
    }

}
