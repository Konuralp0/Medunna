package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaAppointmentPage;
import utilities.Driver;

public class US013 {
    MedunnaAppointmentPage medunnaAppointmentPage=new MedunnaAppointmentPage();

    @Then("Show test results butonuna tiklar")
    public void show_test_results_butonuna_tiklar() {
        medunnaAppointmentPage.showTestResults.click();
        Driver.wait(2);

    }

    @Then("View results butonuna tiklar")
    public void view_results_butonuna_tiklar() {
        medunnaAppointmentPage.viewResults.click();

    }

    @Then("Test sonuclarinin gorulebildigini test eder")
    public void testSonuclarininGorulebildiginiTestEder() {
        System.out.println(medunnaAppointmentPage.tableSonuc2.getText());
        System.out.println(medunnaAppointmentPage.tableSonuc1.getText());
        Assert.assertTrue("Test sonucu gorulmuyor", medunnaAppointmentPage.tableSonuc1.isDisplayed()); //Urea
        Assert.assertTrue("Test sonucu gorulmuyor", medunnaAppointmentPage.tableSonuc2.isDisplayed()); //Sodium
        Assert.assertTrue("Test sonucu gorulmuyor", medunnaAppointmentPage.tableSonuc3.isDisplayed()); //glucose

    }

    @Then("Request inpatient butonunun oldugunu test eder")
    public void requestInpatientButonununOldugunuTestEder() {
        Assert.assertTrue(medunnaAppointmentPage.requestInpatient.isDisplayed());
    }
}
