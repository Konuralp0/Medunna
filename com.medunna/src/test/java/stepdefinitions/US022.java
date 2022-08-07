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

    @And("Staff olarak  siteye giris yapar")
    public void staffOlarakSiteyeGirisYapar() {
        mainPage.signInRegister.click();
        mainPage.signIn.click();
        mainPage.username.sendKeys("asa" );
        mainPage.password.sendKeys("123456");
        mainPage.sigInButton.click();
        Driver.wait(2);

    }

    @And("staff kullanici adini ve sifresini girer")
    public void staffKullaniciAdiniVeSifresiniGirer() {
        mainPage.username.sendKeys("asa" +Keys.TAB);
        mainPage.password.sendKeys("123456");

    }

    @Given("My Pages sekmesine tiklar")
    public void myPagesSekmesineTiklar() {
        mainPage.mYPAGES.click();
    }

    @And("Search patient sekmesine tiklar")
    public void searchPatientSekmesineTiklar() {
        staffPage.searchPatient.click();
    }

    @And("Patient SSN bolumune hasta SSN ID si girer")
    public void patientSSNBolumuneHastaSSNIDSiGirer() {
        staffPage.ssnInput.sendKeys("587-45-8880");

    }

    @Then("Hasta bilgilerini gorebildigini test eder")
    public void hastaBilgileriniGorebildiginiTestEder() {
        Assert.assertTrue( staffPage.patientFindVerification.isDisplayed());
    }

    @And("show appointments a tiklar")
    public void showAppointmentsATiklar() {
        staffPage.showAppointments.click();
    }

    @And("show tests e tiklar")
    public void showTestsETiklar() {
        staffPage.showTests.click();
    }

    @Then("Sonuclari sayilarla duzenleyebilecegini test eder")
    public void sonuclariSayilarlaDuzenleyebileceginiTestEder() {

    }

    @And("view result a tiklar")
    public void viewResultATiklar() {

    }
}

