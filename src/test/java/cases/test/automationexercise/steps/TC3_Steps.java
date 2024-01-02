package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class TC3_Steps {
    @Then("Verify error Your email or password is incorrect is visible")
    public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible() {
        Assert.assertEquals(new LoginPage().verifyIncorrectText(), "Your email or password is incorrect!");
    }
}
