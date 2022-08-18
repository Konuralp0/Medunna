package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MedunnaContactPage;
import pages.MedunnaMainPage;
import utilities.Driver;

public class US026 {

    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaContactPage contactPage = new MedunnaContactPage();
    @When("Contact butonuna tiklar")
    public void contactButonunaTiklar() {
        Driver.wait(3);
        mainPage.contactButton.click();
    }


    @And("Mesaj icin gerekli yerleri doldurur")
    public void mesajIcinGerekliYerleriDoldurur() {
        Driver.wait(3);
        contactPage.nameInput.sendKeys("Chriss");
        contactPage.emailInput.sendKeys("random@gmail.com");
        contactPage.subjectInput.sendKeys("Random subject");
        contactPage.messageInput.sendKeys("Random text.");
    }

    @And("Mesaji gonderir")
    public void mesajiGonderir() {
        contactPage.sendButton.click();
    }

    @Then("Mesajin gonderildigi uyarisi cikar")
    public void mesajinGonderildigiUyarisiCikar() {
        Assert.assertTrue("Mesaj gonderildi uyarisi gozukmedi", contactPage.messageReceived.isDisplayed());
    }
}
