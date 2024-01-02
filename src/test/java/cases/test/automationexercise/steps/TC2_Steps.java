package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TC2_Steps {
    @When("The user enters correct email address {string}")
    public void theUserEntersCorrectEmailAddress(String loginEmailBoxText) {
        new LoginPage().enterLoginEmailBoxText(loginEmailBoxText);
    }

    @When("The user enters correct password {string}")
    public void theUserEntersCorrectPassword(String loginPasswordBoxText) {
        new LoginPage().enterloginPasswordBoxText(loginPasswordBoxText);
    }

    @And("The user clicks login button")
    public void theUserClicksLoginButton() {
        new LoginPage().clickLoginButton();
    }
}
