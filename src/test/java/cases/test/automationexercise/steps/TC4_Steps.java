package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.LoginPage;
import io.cucumber.java.en.When;

public class TC4_Steps {
    @When("The user clicks Logout button")
    public void theUserClicksLogoutButton() {
        new LoginPage().clickLogoutButton();
    }
}
