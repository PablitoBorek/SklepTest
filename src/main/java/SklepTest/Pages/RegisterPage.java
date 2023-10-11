package SklepTest.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends BasePage {

    @FindBy(how = How.CSS, using = "#username")
    WebElement loginInput;

    @FindBy(how = How.CSS, using = "#password")
    WebElement passwordInput;

    @FindBy(how = How.CSS, using = "#reg_email")
    WebElement registerEmail;

    @FindBy(how = How.CSS, using = "#reg_password")
    WebElement registerPassword;

    @FindBy(how = How.XPATH, using = "//input[@name=\"login\"]")
    WebElement loginButton;

    @FindBy(how = How.XPATH, using = "//input[@name=\"register\"]")
    WebElement registerButton;

    public void fillLoginName(String name) {
        loginInput.clear();
        loginInput.sendKeys(name);
    }

    public void fillPassword(String password) {
        passwordInput.clear();
        passwordInput.sendKeys(password);
    }

    public void fillRegisterEmail(String email) {
        registerEmail.clear();
        registerEmail.sendKeys(email);
    }

    public void fillRegisterPassword(String password) {
        registerPassword.clear();
        registerPassword.sendKeys(password);
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
