package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.CheckOutPage;
import cases.test.automationexercise.pages.PaymentPage;
import cases.test.automationexercise.pages.ViewCartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC14_Steps {
    @Then("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        Assert.assertEquals(new ViewCartPage().verifyShoppingCartText(), "Shopping Cart");
    }

    @When("The user clicks Proceed To Checkout button")
    public void theUserClicksProceedToCheckoutButton() {
        new ViewCartPage().clickProceedToCheckoutButton();
    }

    @And("The user clicks Register-Login button")
    public void theUserClicksRegisterLoginButton() {
        new ViewCartPage().clickregisterLoginButton();
    }

    @Then("Verify that the delivery address is same address filled at the time registration of account")
    public void verifyThatTheDeliveryAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertEquals(new ViewCartPage().getDeliveryAddress(), "1 Prime Road");
    }

    @And("Verify that the billing address is same address filled at the time registration of account")
    public void verifyThatTheBillingAddressIsSameAddressFilledAtTheTimeRegistrationOfAccount() {
        Assert.assertEquals(new ViewCartPage().getBillingAddress(), "1 Prime Road");
    }

    @When("The user enters description in comment text area {string}")
    public void theUserEntersDescriptionInCommentTextArea(String commentText) {
        new CheckOutPage().enterCommentTextBox(commentText);
    }

    @And("Click Place Order button")
    public void clickPlaceOrderButton() {
        new CheckOutPage().clickPlaceOrderButton();
    }

    @And("The user enters payment details Name on Card {string}")
    public void theUserEntersPaymentDetailsNameOnCard(String nameOnCardText) {
        new PaymentPage().enterNameOnCardText(nameOnCardText);
    }

    @And("The user enters payment details Card Number {string}")
    public void theUserEntersPaymentDetailsCardNumber(String cardNumberText) {
        new PaymentPage().enterCardNumberText(cardNumberText);
    }

    @And("The user enters payment details CVC {string}")
    public void theUserEntersPaymentDetailsCVC(String cvcNumberText) {
        new PaymentPage().enterCvcNumberText(cvcNumberText);
    }

    @And("The user enters payment details Expiration month {string}")
    public void theUserEntersPaymentDetailsExpirationMonth(String expiryMonthText) {
        new PaymentPage().enterExpiryMonthText(expiryMonthText);
    }

    @And("The user enters payment details Expiration year {string}")
    public void theUserEntersPaymentDetailsExpirationYear(String expiryYearText) {
        new PaymentPage().enterExpiryYearText(expiryYearText);
    }

    @When("The user clicks Pay and Confirm Order button")
    public void theUserClicksPayAndConfirmOrderButton() {
        new PaymentPage().clickPayAndConfirmOrderButton();
    }

    @Then("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
    }
}
