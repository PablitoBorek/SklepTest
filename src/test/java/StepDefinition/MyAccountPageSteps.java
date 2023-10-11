package StepDefinition;

import SklepTest.Pages.MyAccountPage;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;

public class MyAccountPageSteps {

    MyAccountPage myAccountPage = new MyAccountPage();

    @Then("I am on My Account Page")
    public void i_am_on_MY_Account_Page() {
        String myAccountPageName = myAccountPage.driver.getTitle();
        Assertions.assertEquals("My account – Generic Shop", myAccountPageName);
    }
}
