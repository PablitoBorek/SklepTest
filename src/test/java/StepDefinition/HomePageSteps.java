package StepDefinition;

import SklepTest.Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebElement;

public class HomePageSteps extends BaseComponent{

    HomePage homePage = new HomePage();

    public HomePageSteps(WebElement root) {
        super(root);
    }

    @Given("Browser is open")
    public void browser_is_open() {
        homePage.openHomePage();
    }

    @Then("I am on the main site")
    public void i_am_on_the_main_site() {
        String homePageName = homePage.getHomepageName();
        Assertions.assertEquals("Generic Shop", homePageName);
    }
}
