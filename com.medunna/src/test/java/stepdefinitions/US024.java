package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaMainPage;
import pages.MedunnaPatientPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US024 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaPatientPage patientPage =new MedunnaPatientPage();

    @And("Patient olarak giris yapar")
    public void patient_olarak_giris_yapar(){

        mainPage.username.sendKeys(ConfigReader.getProperty("PatientPass1") + Keys.TAB);
        Driver.wait(3);
        mainPage.password.sendKeys(ConfigReader.getProperty("PatientPass1"));
        Driver.wait(2);
        mainPage.sigInButton.click();
        Driver.wait(2);
    }

    @And("My Pages Patient menusu tiklanir")
    public void myPagesPatient_SekmesineTiklar() {
        patientPage.MyPages_Patient.click();
        Driver.wait(2);
    }

    @And("My Appointmentsi secer")
    public void myAppointmentsiSecer() {
        patientPage.my_Appointments.click();
        Driver.wait(2);
    }

    @And("Show Test sekmesini secer")
    public void showTestSekmesiniSecer() {
        patientPage.show_Tests.click();
        Driver.wait(2);
    }

    @And("View Results sekmesine tiklar")
    public void viewResultsSekmesineTiklar() {
        patientPage.view_Results.click();
        Driver.wait(2);
    }

    @Then("Test verilerinin tamamini gorebildigini test eder")
    public void testVerilerininTamaminiGorebildiginiTestEder() {
        Assert.assertTrue(patientPage.testResults_id.isDisplayed());
        Assert.assertTrue(patientPage.testResults_name.isDisplayed());
        Assert.assertTrue(patientPage.testResults_result.isDisplayed());
        Assert.assertTrue(patientPage.testResults_dafault_minValue.isDisplayed());
        Assert.assertTrue(patientPage.testResults_default_maxValue.isDisplayed());
        Assert.assertTrue(patientPage.testResults_description.isDisplayed());
        Assert.assertTrue(patientPage.testResults_default_date.isDisplayed());
        Assert.assertTrue(patientPage.testResults_test.isDisplayed());

        System.out.println("veriler goruldu....................................");

    }
    @And("Baska bir Patient olarak giris yapar")
    public void baskaBirPatientOlarakGirisYapar() {

        mainPage.username.sendKeys(ConfigReader.getProperty("PatientUserName2") + Keys.TAB);
        Driver.wait(3);
        mainPage.password.sendKeys(ConfigReader.getProperty("PatientPass2"));
        Driver.wait(2);
        mainPage.sigInButton.click();
        Driver.wait(2);
    }

    @And("Show Invoice sekmesine tiklar")
    public void showInvoiceSekmesineTiklar() {
        patientPage.show_Invoice.click();
        Driver.wait(2);
    }


    @Then("Odeme bilgilerini gordugunu test eder")
    public void odemeBilgileriniGordugunuTestEder() {
        Assert.assertTrue(patientPage.odeme_Patient_Name.isDisplayed());
        Assert.assertTrue(patientPage.odeme_total_cost.isDisplayed());
    }
}
