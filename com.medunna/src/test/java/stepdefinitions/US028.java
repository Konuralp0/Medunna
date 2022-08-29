package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.MedunnaMainPage;
import pojo.Country;
import pojo.RequestMessageResponseItem;
import pojo.ResponseCountryItem;
import utilities.Authentication;
import utilities.Driver;

import java.lang.reflect.Type;

public class US028 {

    MedunnaMainPage mainPage = new MedunnaMainPage();



    @And("Clicks on country")
    public void clicksOnCountry() {
        mainPage.country.click();
        Driver.wait(1);
    }

    @Then("Clicks on create new country")
    public void clicksOnCreateNewCountry() {
        mainPage.createANewCountry.click();
        Driver.wait(1);
    }

    @And("Writes a country name")
    public void writesACountryName() {
        mainPage.name.sendKeys(Faker.instance().country().name());
        Driver.wait(1);
    }

    @Then("clicks save")
    public void clicksSave() {
        mainPage.save.click();
        Driver.wait(1);
    }

    @And("test whether the country is succesfully created")
    public void testWhetherTheCountryIsSuccesfullyCreated() {
        Assert.assertTrue(mainPage.aNewCountryIsCreatedWith.isDisplayed());
        Driver.wait(1);
    }

    @And("clicks on delete a country button")
    public void clicksOnDeleteACountryButton() {
        mainPage.deleteCountry.click();
        Driver.wait(1);
    }

    @Then("test whether the country is deleted")
    public void testWhetherTheCountryIsDeleted() {
        Assert.assertTrue(mainPage.internalServerError.isDisplayed());
        Driver.wait(1);
    }


    @Then("clicks on create new city")
    public void clicksOnCreateNewCity() {

        mainPage.createANewState.click();
        Driver.wait(1);



    }

    @And("writes a city name")
    public void writesACityName() {
        mainPage.stateName.sendKeys(Faker.instance().country().capital());
        Driver.wait(1);
    }

    @Then("clicks on save")
    public void clicksOnSave() {
        mainPage.save.click();
    }

    @Then("test whether the city is succesfully created")
    public void testWhetherTheCityIsSuccesfullyCreated() {

        Assert.assertTrue(mainPage.fieldTranslationnotfound.isDisplayed());
    }

    Country country = new Country();
    Response response;

    @Given("User creates a country")
    public void userCreatesACountry() {
        country.setName(Faker.instance().country().name());


    }

    @And("Posts the country")
    public void postsTheCountry() {
        response = RestAssured.given().contentType(ContentType.JSON).header("Authorization","Bearer "+ Authentication.tokenGenerate())
                .body(country).when().post("https://medunna.com/api/countries");
    }

    @Then("With request compares both countries")
    public void withRequestComparesBothCountries() {
        ResponseCountryItem responseCountryItem = response.as((Type) Country.class);
        Assert.assertEquals(responseCountryItem.getName(),country.getName());
    }


    @And("clicks on state or city")
    public void clicksOnStateOrCity() {
        mainPage.state.click();
    }
}
