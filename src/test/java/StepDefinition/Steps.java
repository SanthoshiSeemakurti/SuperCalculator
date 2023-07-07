package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.limehome.BasePage;
import org.testng.Assert;

public class Steps {
    BasePage basePage;
    @Given("the user is on Super calculator page")
    public void the_user_is_on_super_calculator_page() {
        basePage.launchCalculatorPage();
    }
    @When("the user enters two values")
    public void the_user_enters_two_values() {
        basePage.enterOperand1();
        basePage.enterOperand2();
    }
    @And("the user chooses addOperation")
    public void theUserChoosesAddOperation() {
        basePage.selectAddOperator();
    }
    @And("the user chooses division operation")
    public void theUserChoosesDivisionOperation() {
        basePage.selectDivisionOperator();
    }

    @And("the user chooses modulo operation")
    public void theUserChoosesModuloOperation() {
        basePage.selectModuloOperator();
    }
    @And("the user chooses multiplication operation")
    public void theUserChoosesMultiplicationOperation() {
        basePage.selectMultiplicationOperator();
    }

    @And("the user chooses subtraction operation")
    public void theUserChoosesSubtractionOperation() {
        basePage.selectSubtractionOperator();
    }

    @When("the user clicks on the Go bottom")
    public void the_user_clicks_on_the_go_bottom() {
    basePage.clickGoButton();
    }
    @Then("the user gets the result")
        public void the_user_gets_the_result (double result) {
        System.out.println(basePage.result (result));
    }


}
