package stepdefinitions;

import com.github.javafaker.Faker;
import com.sun.source.tree.AssertTree;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import pages.MedunnaMainPage;
import pages.MedunnaMessagesPage;
import pojo.RequestMessage;
import pojo.RequestMessageResponseItem;
import utilities.Authentication;
import utilities.Driver;

public class US027 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaMessagesPage medunnaMessagesPage = new MedunnaMessagesPage();

    @And("Clicks on Messages")
    public void clicksOnMessages() {
        Driver.wait(2);
        mainPage.messages.click();
    }

    @Then("Tests whether the author and messages are visible")
    public void testsWhetherTheAuthorAndMessagesAreVisible() {
        Driver.wait(2);
        Assert.assertTrue(medunnaMessagesPage.name.isDisplayed());
        Assert.assertTrue(medunnaMessagesPage.email.isDisplayed());
        Assert.assertTrue(medunnaMessagesPage.message.isDisplayed());



    }



    @Then("Tests Delete Edit And View Buttons are enabled")
    public void testsDeleteEditAndViewButtonsAreEnabled() {
        Driver.wait(2);
        Assert.assertTrue(medunnaMessagesPage.createANewMessage.isEnabled());
        Assert.assertTrue(medunnaMessagesPage.edit.isEnabled());
        Assert.assertTrue(medunnaMessagesPage.delete.isEnabled());
    }
    RequestMessage requestMessage = new RequestMessage();
    Response response;
    @Given("User creates a Message")
    public void userCreatesAMessage() {
        requestMessage.setMessage("HI");
        requestMessage.setEmail(Faker.instance().internet().emailAddress());
        requestMessage.setName(Faker.instance().name().fullName());
        requestMessage.setSubject("API");
    }

    @And("Posts the message")
    public void postsTheMessage() {
        response = RestAssured.given().contentType(ContentType.JSON).header("Authorization","Bearer "+ Authentication.tokenGenerate())
                .body(requestMessage).when().post("https://medunna.com/api/c-messages");
    }

    @Then("With request compares both messages")
    public void withRequestComparesBothMessages() {
        RequestMessageResponseItem requestMessageResponseItem = response.as(RequestMessageResponseItem.class);
        Assert.assertEquals(requestMessage.getName(),requestMessageResponseItem.getName());

    }
}
