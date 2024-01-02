package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.ViewCartPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC17_Steps {
    @When("The user clicks X button corresponding to particular product")
    public void theUserClicksXButtonCorrespondingToParticularProduct() {
        new ViewCartPage().clickRemoveQtyButton();
    }

    @Then("Verify that product is removed from the cart")
    public void verifyThatProductIsRemovedFromTheCart() {
        Assert.assertEquals(new ViewCartPage().verifycartEmptyText(), "");
    }
}
