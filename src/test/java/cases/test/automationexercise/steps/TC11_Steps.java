package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.ViewCartPage;
import io.cucumber.java.en.When;

public class TC11_Steps {
    @When("The user clicks Cart menu button")
    public void theUserClicksCartMenuButton() {
        new ViewCartPage().clickCartButton();

    }
}
