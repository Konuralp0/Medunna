package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaAdminItemsAndTitles;
import pages.MedunnaAppointmentPage;
import pages.MedunnaMainPage;
import pages.MedunnaPhysicianPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US010 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaAppointmentPage appointmentPage = new MedunnaAppointmentPage();
    MedunnaAdminItemsAndTitles medunnaAdminItemsAndTitles=new MedunnaAdminItemsAndTitles();
    MedunnaPhysicianPage physicianPage = new MedunnaPhysicianPage();




    @And("doktor kullanici adini ve sifresini girer")
    public void doktorKullaniciAdiniVeSifresiniGirer() {

        mainPage.username.sendKeys(ConfigReader.getProperty("asa"));
        mainPage.password.sendKeys(ConfigReader.getProperty("123456"));

        Driver.wait(2);

    }
    @And("Mypages butonuna tiklar")
    public void mypagesButonunaTiklar() {
        mainPage.mYPAGES.click();
        Driver.wait(2);


    }



    @And("Items&titles butonuna tiklar")
    public void clicksOnItemsAndTitles() {
        medunnaAdminItemsAndTitles.itemsTitlesButton.click();

    }
    @Then("MyAppointmenti secer")
    public void myappointmentiSecer() {
        mainPage.myAppointments.click();
        Driver.wait(2);
    }



    @Then("randevu listesi ve zaman dilimleri oldugunu kontrol eder")
    public void randevuListesiVeZamanDilimleriOldugunuKontrolEder() {
        Assert.assertTrue(appointmentPage.patientAppointments.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentStartDate.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentEndDate.isDisplayed());

    }

    @Then("patient id, start date, end date ve status bilgileri oldugunu kontrol eder")
    public void patientIdStartDateEndDateVeStatusBilgileriOldugunuKontrolEder() {
        Assert.assertTrue(appointmentPage.patientAppointments.isDisplayed());
        Assert.assertTrue(appointmentPage.selectedAppointmentStartDate.isDisplayed());
        Assert.assertTrue(appointmentPage.selectedAppointmentEndDate.isDisplayed());
        Assert.assertTrue(appointmentPage.selectedAppointmentStatus.isDisplayed());




    }

    @And("patient kullanici adini ve sifresini girer")
    public void patientKullaniciAdiniVeSifresiniGirer() {
        mainPage.username.sendKeys("adem" + Keys.TAB);
        mainPage.password.sendKeys("123456");
    }
}