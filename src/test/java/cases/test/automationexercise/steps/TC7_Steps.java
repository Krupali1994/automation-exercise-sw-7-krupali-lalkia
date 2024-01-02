package cases.test.automationexercise.steps;

import cases.test.automationexercise.pages.TestCasesPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TC7_Steps {
    @When("The user clicks Test Cases menu button")
    public void theUserClicksTestCasesMenuButton() {
        new TestCasesPage().clickTestCases();
    }

    @Then("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assert.assertEquals(new TestCasesPage().verifyTestCasesText(), "TEST CASES");
    }
}
