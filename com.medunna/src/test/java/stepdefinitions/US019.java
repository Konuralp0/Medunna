package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaAdminItemsAndTitles;
import pages.MedunnaMainPage;
import pojo.RequestStaff;
import pojo.RequestStaffResponse;
import pojo.RequestStaffResponseItem;
import utilities.Authentication;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US019 {


    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaAdminItemsAndTitles medunnaAdminItemsAndTitles = new MedunnaAdminItemsAndTitles();
    @And("Clicks on staff")

    public void clicksOnStaff() {
        mainPage.staff.click();
    }

    @And("Clicks on create a new Staff")
    public void clicksOnCreateANewStaff() {
        medunnaAdminItemsAndTitles.createANewStaff.click();
    }

    @And("Inputs SSN")
    public void inputsSSN() {
        medunnaAdminItemsAndTitles.sSNStaffCreation.sendKeys(ConfigReader.getProperty("StaffSSNSearch"));
    }

    @And("Clicks on Use Search")
    public void clicksOnUseSearch() {
        medunnaAdminItemsAndTitles.tickboxSSN.click();
        medunnaAdminItemsAndTitles.searchUser.click();

    }

    @Then("Tests whether the given SSN number searchs the wanted user")
    public void testsWhetherTheGivenSSNNumberSearchsTheWantedUser() {
        Driver.wait(3);
        Assert.assertEquals("Toy",medunnaAdminItemsAndTitles.lastNameCheck.getAttribute("value"));

    }

    @And("Tests whether personal information can be left blank")
    public void testsWhetherPersonalInformationCanBeLeftBlank() {
        Driver.wait(3);
        medunnaAdminItemsAndTitles.phoneNumber.click();
        Driver.wait(3);
        medunnaAdminItemsAndTitles.lastNameCheck.click();
        Driver.wait(3);
        Assert.assertTrue(medunnaAdminItemsAndTitles.phoneNumberIsRequired.isDisplayed());
    }

    @And("Test whether selecting user from registered users is enabled")
    public void testWhetherSelectingUserFromRegisteredUsersIsEnabled() {
        Select select = new Select(medunnaAdminItemsAndTitles.userName);
        Driver.wait(3);
        List<WebElement> allUsers = select.getAllSelectedOptions();
        Assert.assertTrue(allUsers.size() >0);
    }

    @Then("Tests whether Deleting and Editing Buttons are enabled")
    public void testsWhetherDeletingAndEditingButtonsAreEnabled() {
        Assert.assertTrue(medunnaAdminItemsAndTitles.editStaff.isEnabled());
        Assert.assertTrue(medunnaAdminItemsAndTitles.deleteStaff.isEnabled());
    }


    RequestStaff requestStaff = new RequestStaff();
    Response response;
    @Given("User creates Staff")
    public void userCreatesStaff() {
        requestStaff.setFirstName(Faker.instance().name().firstName());
        requestStaff.setLastName(Faker.instance().name().lastName());
        requestStaff.setPhone(Faker.instance().phoneNumber().cellPhone());
        requestStaff.setSsn(Faker.instance().idNumber().ssnValid());

    }

    @And("User posts the created Staff")
    public void userPostsTheCreatedStaff() {
        response = RestAssured.given().
                contentType(ContentType.JSON).header("Authorization","Bearer "+ Authentication.tokenGenerate())
                .body(requestStaff).when().post("https://medunna.com/api/staff");
    }

    @Then("tests whether they match")
    public void testsWhetherTheyMatch() {
        RequestStaffResponseItem requestStaffResponse = response.as(RequestStaffResponseItem.class);
        Assert.assertEquals(requestStaffResponse.getFirstName(),requestStaff.getFirstName());



    }
}
