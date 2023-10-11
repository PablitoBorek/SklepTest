package StepDefinition;

import SklepTest.Pages.RegisterPage;
import io.cucumber.java.en.When;

public class RegisterPageSteps {

    RegisterPage registerPage = new RegisterPage();

    @When("I fill login register email with {string}")
    public void iFillLoginRegisterEmailWith(String login) {
        registerPage.fillRegisterEmail(login);
    }

    @When("I fill login register password input with {string}")
    public void iFillLoginRegisterPasswordInputWith(String password) {
        registerPage.fillRegisterPassword(password);
    }

    @When("I click register Button on Register Page")
    public void iClickRegisterButtonOnRegisterPage() {
        registerPage.clickRegisterButton();
    }
}
