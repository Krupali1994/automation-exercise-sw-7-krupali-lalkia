package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC10_Steps {
    @When("The user scrolls down to footer")
    public void theUserScrollsDownToFooter() {
        new HomePage().scrollDownToRecommendedItems();
    }

    @Then("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        Assert.assertEquals(new HomePage().verifySubscriptionText(), "SUBSCRIPTION");
    }

    @When("The user enters email address {string}")
    public void theUserEntersEmailAddress(String subscribeEmailBoxText) {
        new HomePage().enterSubscribeEmailBox(subscribeEmailBoxText);
    }

    @When("The user clicks Subscription submit button")
    public void theUserClicksSubscriptionSubmitButton() {
        new HomePage().clickOnArrowToSubscribe();
    }

    @Then("Verify success message You have been successfully subscribed is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        Assert.assertEquals(new HomePage().verifySuccessSubscribeText(), "You have been successfully subscribed!");
    }
}
