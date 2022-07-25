package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaAppointmentPage;
import pages.MedunnaMainPage;
import utilities.ConfigReader;
import utilities.Driver;


public class US011 {
   MedunnaMainPage mainPage = new MedunnaMainPage();
   MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

    @And("kullanici olusturdugu adini ve sifresini girer")
    public void kullaniciOlusturduguAdiniVeSifresiniGirer() {

        mainPage.username.sendKeys(ConfigReader.getProperty("username"));
        mainPage.password.sendKeys(ConfigReader.getProperty("password"));

        Driver.wait(2);


    }

    @And("Mypages butonuna tiklar")
    public void mypagesButonunaTiklar() {
        mainPage.mYPAGES.click();
        Driver.wait(2);


    }

    @Then("MyAppointmenti secer")
    public void myappointmentiSecer() {
        mainPage.myAppointments.click();
        Driver.wait(2);
    }

    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        medunnaAppointmentPage.edit.click();
        Driver.wait(2);
    }

    @Then("Edit sayfasinda oldugunu test eder")
    public void editSayfasindaOldugunuTestEder() {
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.medunna.com/appointment-update/135183",url);
        Driver.wait(2);


    }

    @Then("Anamsesi, Treatmente, Diagnosisi degistirir ama Prescription ve Description bos kalir")
    public void anamsesiTreatmenteDiagnosisiDegistirirAmaPrescriptionVeDescriptionBosKalir() {
        medunnaAppointmentPage.anamnesis.sendKeys("ABCDEFGHT");
        medunnaAppointmentPage.diagnosis.sendKeys(Faker.instance().medical().diseaseName());
        medunnaAppointmentPage.treatment.sendKeys(Faker.instance().medical().medicineName());
        Driver.wait(2);

        Assert.assertFalse(isPresent(medunnaAppointmentPage.thisFieldIsRequired));


    }

    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {
        medunnaAppointmentPage.save.click();
        Driver.wait(2);



    }

    @Then("Yeni guncel  bilgileri gorebildigini test eder")
    public void yeniGuncelBilgileriGorebildiginiTestEder() {
        Assert.assertTrue(medunnaAppointmentPage.physician.isDisplayed());
        Assert.assertTrue(medunnaAppointmentPage.id.isDisplayed());
        Assert.assertTrue(medunnaAppointmentPage.patient.isDisplayed());
        Assert.assertTrue(medunnaAppointmentPage.startDate.isDisplayed());
        Assert.assertTrue(medunnaAppointmentPage.endDate.isDisplayed());
        Assert.assertTrue(medunnaAppointmentPage.status.isDisplayed());
    }

    @And("Statusu degisitirir")
    public void statusuDegisitirir() {
        Select select = new Select(medunnaAppointmentPage.statusChange);
        select.selectByVisibleText("COMPLETED");
        Driver.wait(2);
    }

    @And("Statusun degistigini kontrol eder")
    public void statusunDegistiginiKontrolEder() {
        Assert.assertEquals("COMPLETED", medunnaAppointmentPage.status.getText());

    }


    public boolean isPresent(WebElement element){
        try {
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException e){
            return false;
        }


    }


}
