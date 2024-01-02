package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.HomePage;
import io.cucumber.java.en.When;

public class TC26_Steps {
    @When("The user scrolls up to top")
    public void theUserScrollsUpToTop() {
        new HomePage().scrollUpScript();
    }
}
