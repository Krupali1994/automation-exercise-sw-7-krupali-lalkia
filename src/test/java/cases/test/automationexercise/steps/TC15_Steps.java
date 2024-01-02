package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class TC15_Steps {
    @When("User Selects Year {string}{int}")
    public void userSelectsYear(String arg0, int arg1) {
    }

    @And("The user clicks after delete Continue button")
    public void theUserClicksAfterDeleteContinueButton() {
        new RegisterPage().clickDeleteContinueButton();
    }
}
