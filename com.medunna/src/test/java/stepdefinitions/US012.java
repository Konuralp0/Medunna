package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.MedunnaAppointmentPage;
import utilities.Driver;

public class US012 {

    MedunnaAppointmentPage appointmentPage = new MedunnaAppointmentPage();

    @When("Request a Test butonuna tiklar")
    public void request_a_test_butonuna_tiklar() {
        Driver.wait(6);
        appointmentPage.requestATestButton.click();
    }

    @And("Sodium ve Urea secer")
    public void sodium_ve_urea_secer() {
        Driver.wait(3);
        appointmentPage.sodiumCheckbox.click();
        appointmentPage.ureaCheckbox.click();
    }

    @And("Save butonuna  tiklar")
    public void save_butonuna_tiklar() {
        Driver.wait(2);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();",appointmentPage.saveButton);
    }

    @Then("Sodium ve Urea test iceriginde oldugu gorulur")
    public void sodiumVeUreaTestIcerigindeOlduguGorulur() {
        Driver.wait(3);
        String ilkIcerik = appointmentPage.ilkTestIcerik.getText();
        String ikinciIcerik = appointmentPage.ikinciTestIcerik.getText();
        Assert.assertEquals("Ilk test icerigi yanlis", ilkIcerik, "Sodium");
        Assert.assertEquals("Ikinci test icerigi yanlis", ikinciIcerik, "Urea");
    }
}
