package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.ProductsPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC20_Steps {
    @Then("Verify that products are visible in cart")
    public void verifyThatProductsAreVisibleInCart() {
        Assert.assertEquals(new ProductsPage().verifyProductNameinCart(), "Blue Top");
    }

    @Then("Verify that those products are visible in cart after login as well")
    public void verifyThatThoseProductsAreVisibleInCartAfterLoginAsWell() {
        Assert.assertEquals(new ProductsPage().verifyProductNameinCart(), "Blue Top");
    }
}
