package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaAppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US021 {
    MedunnaAppointmentPage medunnaAppointmentPage=new MedunnaAppointmentPage();
    private WebElement driver;

    @Given("Show appointments butonuna tiklar")
    public void show_appointments_butonuna_tiklar() {
        medunnaAppointmentPage.showAppointments.click();


    }

    @Given("Appointmen'i duzenlemek icin edit butonuna tiklar")
    public void appointmen_i_duzenlemek_icin_edit_butonuna_tiklar() {
        medunnaAppointmentPage.editAppointments.click();


    }

    @Then("Appointment duzenleme sayfasinda oldugunu test eder")
    public void appointment_duzenleme_sayfasinda_oldugunu_test_eder() {
        Assert.assertTrue(medunnaAppointmentPage.editAppointmentPage.isDisplayed());


    }

    @And("Status acilir menusune tiklar")
    public void statusAcilirMenusuneTiklar() {
        medunnaAppointmentPage.statusPopup.click();
    }

    @Then("Menude UNAPPROVED, PENDING or CANCELLED opsiyonlarinin aktif oldugunu test eder")
    public void menudeUNAPPROVEDPENDINGOrCANCELLEDOpsiyonlarininAktifOldugunuTestEder() {
        Assert.assertTrue(medunnaAppointmentPage.statusPopupUnapproved.isEnabled());
        Assert.assertTrue(medunnaAppointmentPage.statusPopupPending.isEnabled());
        Assert.assertFalse(medunnaAppointmentPage.statusPopupCompleted.isEnabled());
        Assert.assertTrue(medunnaAppointmentPage.statusPopupCancelled.isEnabled());




    }

    @Then("Anamnesis, Treatment or Diagnosis bolumlerini bos birakabildigini test eder")
    public void anamnesisTreatmentOrDiagnosisBolumleriniBosBirakabildiginiTestEder() {
        medunnaAppointmentPage.anamnesisArea.clear();
        medunnaAppointmentPage.treatmentArea.clear();
        medunnaAppointmentPage.diagnosisArea.clear();

        US007 us007=new US007();
        us007.isPresent(medunnaAppointmentPage.invalidFeedback);

    }

    @And("Hasta icin bir doktor secebilecegini test eder")
    public void hastaIcinBirDoktorSecebileceginiTestEder() {
        Driver.wait(2);
        Select select = new Select(medunnaAppointmentPage.physicianArea);
        select.selectByValue(ConfigReader.getProperty("physicianId"));


    }


    @And("Show tests butonuna tiklar")
    public void showTestsButonunaTiklar() {
        medunnaAppointmentPage.showTestsButton.click();
    }

    @And("Kullanicinin test sonuclari sayfasinda oldugunu test eder")
    public void kullanicininTestSonuclariSayfasindaOldugunuTestEder() {
        medunnaAppointmentPage.isTestsPage.isDisplayed();
    }
}