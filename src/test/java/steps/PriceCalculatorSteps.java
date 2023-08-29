package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class PriceCalculatorSteps extends CommonMethods {

    @When("Hover row on BasePrice component")
    public void hover_row_on_base_price_component() {

        hoverRow(hoverRowPage.action1);
    }


    @When("User clicks on Pencil icon")
    public void userClicksOnPencilIcon() {

        click(pencilPage.pencil1);
    }

    @When("User clicks on value input on the right")
    public void user_clicks_on_value_input_on_the_right() {

        click(valuePage.baseValueInput);
    }

    @Then("User enters new value {string}")
    public void userEntersNewValue(String newValue) {
       // sendText(value.valueInput, newValue);
        sendText(newValue,valuePage.baseValueInput);
    }
    
    @And("User clicks on Check icon")
    public void userClicksOnCheckIcon() {
        click(checkIconPage.checkIcon);
    }

    @Then("User verify displayed sum shows correct {string}sum")
    public void userVerifyDisplayedSumShowsCorrectTotalSum(String totalSum) {
        String expectedSum =  validatePage.totalSum.getText();
        Assert.assertEquals(totalSum, expectedSum);
    }



    @When("User adds all price components")
    public void user_adds_all_price_components(io.cucumber.datatable.DataTable dataTable) {
        //creating list of maps
        List<Map<String, String>> testData = dataTable.asMaps();
        //getting the list of WebElements for Check Icon which is dynamic
        List<WebElement> checkButtonLocators = Arrays.asList(
                checkIconPage.checkIcon2,
                checkIconPage.checkIcon3,
                checkIconPage.checkIcon4,
                checkIconPage.checkIcon5,
                checkIconPage.checkIcon6
                );
        //getting the map from list of maps
        for (int i = 0; i < testData.size(); i++) {
            String rowMaterial = testData.get(i).get("label");
            String price = testData.get(i).get("value");

            clearText(labelPage.label);
            sendText(labelPage.label, rowMaterial);
            clearText(valuePage.valueInput);
            sendText(valuePage.valueInput, price);
            // Get the locator for the current check button.
            WebElement checkButtonLocator = checkButtonLocators.get(i);

            // Click on the check button using the locator.
            click(checkButtonLocator);
        }

    }

    @Then("verify value has more than decimal digits, round to decimal digits {string}")
    public void verifyValueHasMoreThanDecimalDigitsRoundToDecimalDigits(String expectedResult) {
        String actualResult = validatePage.totalSum.getText();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @When("Hover row on Internal surcharge component")
    public void hover_row_on_internal_surcharge_component() {
        hoverRow(hoverRowPage.action4);
    }

    @When("User click on Trash icon")
    public void user_click_on_trash_icon() {
        click(removeIconPage.trashIcon);
    }

    @Then("User verify displayed sum shows correct {string} sum")
    public void user_verify_displayed_sum_shows_correct_sum(String expectedResult) {
        String actualResult = validatePage.totalSum.getText();
        Assert.assertEquals(expectedResult, actualResult);
    }

    @When("User hover row Storage surcharge component and clicks on the pencil icon")
    public void userHoverRowStorageSurchargeComponentAndClicksOnThePencilIcon() {
        hoverRow(hoverRowPage.action5);
        click(pencilPage.pencil5);
    }

    @When("User clicks and enters new label {string}")
    public void user_clicks_and_enters_new_label(String labelT) {
        clearText(labelPage.label5);
        sendText(labelT,labelPage.label5);
    }

    @Then("Verify if input is invalid {string} restore last valid state")
    public void verifyIfInputIsInvalidRestoreLastValidState(String expectedText) {
        String actualResult = validatePage.actualErrorMsg.getText();
        Assert.assertEquals(expectedText, actualResult);
        click(checkIconPage.checkIcon5);
    }

    @When("Hover row on Scrap surcharge component and clicks on the pencil icon")
    public void hoverRowOnScrapSurchargeComponentAndClicksOnThePencilIcon() {
        hoverRow(hoverRowPage.action3);
        click(pencilPage.pencil3);
    }

    @When("User enters negative value {string}")
    public void userEntersNegativeValue(String negativeNumber) {
        clearText(valuePage.negativeValue);
        sendText(negativeNumber, valuePage.negativeValue);
    }

    @Then("Verify values {string} and restore last valid state")
    public void verifyValuesAndRestoreLastValidState(String expectedErrorMsg) {
        String actualErrorMsg = validatePage.valueErrorMsg.getText();
        Assert.assertEquals(expectedErrorMsg, actualErrorMsg);

    }

    @When("Hover row on Alloy surcharge component and clicks on the pencil icon")
    public void hoverRowOnAlloySurchargeComponentAndClicksOnThePencilIcon() {
        hoverRow(hoverRowPage.action2);
        click(pencilPage.pencil2);
    }

    @When("User enters new value {string} and click on the Check icon")
    public void userEntersNewValueAndClickOnTheCheckIcon(String newValue) {
        clearText(valuePage.newInputValue);
        sendText(newValue, valuePage.newInputValue);
        click(checkIconPage.checkIcon2);
    }

    @Then("Verify displayed sum shows correct sum {string}")
    public void verifyDisplayedSumShowsCorrectSum(String expectedSum) {
        String actualSum = validatePage.totalSum.getText();
        Assert.assertEquals(expectedSum, actualSum);
    }


}
