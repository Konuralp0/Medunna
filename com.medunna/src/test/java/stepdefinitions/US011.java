package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.MedunnaAppointmentPage;
import pages.MedunnaMainPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;


public class US011 {
   MedunnaMainPage mainPage = new MedunnaMainPage();
   MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

    @And("kullanici olusturdugu adini ve sifresini girer")
    public void kullaniciOlusturduguAdiniVeSifresiniGirer() {

        mainPage.username.sendKeys(ConfigReader.getProperty("usernamePhysician"));
        mainPage.password.sendKeys(ConfigReader.getProperty("passwordPhysician"));

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
        Assert.assertEquals("https://www.medunna.com/appointment-update/154734",url);
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
        Driver.wait(2);
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();",medunnaAppointmentPage.save);



    }

    @Then("Yeni guncel  bilgileri gorebildigini test eder")
    public void yeniGuncelBilgileriGorebildiginiTestEder() {
        Assert.assertTrue(medunnaAppointmentPage.physician.isDisplayed());
        Assert.assertTrue(medunnaAppointmentPage.status.isDisplayed());
    }


    @And("Statusu degisitirebildigini test eder")
    public void statusuDegisitirebildiginiTestEder() {
        Select select = new Select(medunnaAppointmentPage.statusChange);
        select.selectByVisibleText("COMPLETED");
        Driver.wait(2);
        medunnaAppointmentPage.anamnesis.click();
        Assert.assertEquals("form-control is-touched is-dirty av-valid form-control",medunnaAppointmentPage.statusChange.getAttribute("class"));




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
