package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaAdminItemsAndTitles;
import pages.MedunnaMainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US017 {
    MedunnaMainPage mainPage=new MedunnaMainPage();
    MedunnaAdminItemsAndTitles medunnaAdminItemsAndTitles=new MedunnaAdminItemsAndTitles();

    @Given("Login as admin")
    public void loginAsAdmin() {
        mainPage.signInRegister.click();
        mainPage.signIn.click();
        mainPage.username.sendKeys(ConfigReader.getProperty("adminUsername") + Keys.TAB);
        mainPage.password.sendKeys(ConfigReader.getProperty("adminPassword")+Keys.TAB);
        mainPage.sigInButton.click();
        Driver.wait(2);

    }

    @And("Clicks on items and titles")
    public void clicksOnItemsAndTitles() {
        medunnaAdminItemsAndTitles.itemsTitlesButton.click();

    }

    @And("Clicks on Test Item")
    public void clicksOnTestItem() {
        medunnaAdminItemsAndTitles.testItemButton.click();
    }

    @And("Tests that there is a {string} on the page.")
    public void testsThatThereIsAOnThePage(String arg0) {
        Assert.assertTrue(medunnaAdminItemsAndTitles.createTestItemButton.isDisplayed());
    }
    @And("Cliks on Create a New Item")
    public void cliksOnCreateANewItem() {
        medunnaAdminItemsAndTitles.createTestItemButton.click();
    }


    @Then("Tests there are test items when creating or updating.")
    public void testsThereAreTestItemsWhenCreatingOrUpdating() {
        Assert.assertTrue(medunnaAdminItemsAndTitles.nameLabel.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.descriptionLabel.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.priceLabel.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.defaultValMinLabel.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.defaultValMaxLabel.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.createdLabel.isDisplayed());

    }

    @And("Tests the visibility of Test Items")
    public void testsTheVisibilityOfTestItems() {
        Assert.assertTrue(medunnaAdminItemsAndTitles.testItems.isDisplayed());
    }

    @And("Tests the visibility of delete button")
    public void testsTheVisibilityOfDeleteButton() {
        Assert.assertTrue(medunnaAdminItemsAndTitles.deleteButton.isDisplayed());
    }
}
