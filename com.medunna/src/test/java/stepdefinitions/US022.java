package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaMainPage;
import pages.MedunnaStaffPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US022 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaStaffPage staffPage = new MedunnaStaffPage();


    @Given("Staff My Pages sekmesine tiklar")
    public void StaffMyPagesSekmesineTiklar() {
        mainPage.mYPAGES.click();
    }

    //@And("Search patient sekmesine tiklar")
    //public void searchPatientSekmesineTiklar() {
      //  staffPage.searchPatient.click();
    //}

    @And("Patient SSN bolumune hasta SSN ID si girer")
    public void patient_ssn_bolumune_hasta_ssn_id_si_girer() {
        staffPage.patientSSN.sendKeys(ConfigReader.getProperty("completedPatientSSN"));

    }



    @And("show appointments a tiklar")
    public void showAppointmentsATiklar() {
        staffPage.showAppointments.click();
    }

    @And("show tests e tiklar")
    public void showTestsETiklar() {
        staffPage.showTests.click();
    }



    @And("view result a tiklar")
    public void viewResultATiklar() {

    }


    @Then("Testlerin gorundugunu kontrol eder")
    public void testlerinGorundugunuKontrolEder() {
        Assert.assertTrue(staffPage.testsID.isDisplayed());
        Assert.assertTrue(staffPage.testsName.isDisplayed());
        Assert.assertTrue(staffPage.testsDescription.isDisplayed());
        Assert.assertTrue(staffPage.testsDate.isDisplayed());
        Assert.assertTrue(staffPage.testsCreatedDate.isDisplayed());
        Assert.assertTrue(staffPage.testsAppointment.isDisplayed());




    }



    @And("secilen test icin edit butonuna tiklar")
    public void secilenTestIcinEditButonunaTiklar() {
        staffPage.testResultsEditButton.click();
    }

    @Then("secilen testlerin gorunebilecegini ve duzenleyebilecegini test eder")
    public void secilenTestlerinGorunebileceginiVeDuzenleyebileceginiTestEder() {
        Assert.assertTrue(staffPage.editTestResult.isDisplayed());


        staffPage.testResultResult.sendKeys("30");
        staffPage.testResultSaveButton.click();
        Assert.assertTrue(staffPage.istResultUpdated.isDisplayed());




    }

    @Then("Bilgilerin gorulabilecegini yada girilebilecegini test eder")
    public void bilgilerinGorulabileceginiYadaGirilebileceginiTestEder() {
        Assert.assertTrue(staffPage.testResultID.isDisplayed());
        Assert.assertTrue(staffPage.testResultDate.isDisplayed());
        Assert.assertTrue(staffPage.testResultCreatedDate.isDisplayed());
        Assert.assertTrue(staffPage.testResultTestItem.isDisplayed());
        Assert.assertTrue(staffPage.testResultTest.isDisplayed());

        staffPage.testResultSaveButton.click();
        Assert.assertTrue(staffPage.istResultUpdated.isDisplayed());


    }
}

