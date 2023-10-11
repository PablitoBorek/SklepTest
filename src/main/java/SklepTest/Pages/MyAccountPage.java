package SklepTest.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyAccountPage extends BasePage{

    @FindBy(how = How.XPATH, using = ".page-title margin-top")
    WebElement myAccountPageName;

    public String getMyAccountPageName() {
        return myAccountPageName.getText();
    }

}
