package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaMainPage;
import pages.MedunnaPhysicianPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;

public class US014 {
    MedunnaMainPage mainPage=new MedunnaMainPage();
    MedunnaPhysicianPage physicianPage=new MedunnaPhysicianPage();



    @Then(value = "istenilen bilgilerin goruntulendigini kontrol eder")
    public void istenilenBilgilerinGoruntulendiginiKontrolEder() {

        Assert.assertTrue(physicianPage.inPatientID.isDisplayed());
        Assert.assertTrue(physicianPage.inPatientStartDate.isDisplayed());
        Assert.assertTrue(physicianPage.inPatientEndDate.isDisplayed());
        Assert.assertTrue(physicianPage.inPatientStatus.isDisplayed());
        Assert.assertTrue(physicianPage.inPatientDescription.isDisplayed());
        Assert.assertTrue(physicianPage.inPatientCreatedDate.isDisplayed());
        Assert.assertTrue(physicianPage.inPatientRoom.isDisplayed());
        Assert.assertTrue(physicianPage.inPatientAppointment.isDisplayed());
        Assert.assertTrue(physicianPage.inPatientPatientInformation.isDisplayed());

    }

    @And("Physicians Edit butonuna tiklar")
    public void PhysiciansEditButonunaTiklar() {
        physicianPage.inPatientEdit.click();
    }

    @Then("Status un guncellenebildigini kontrol eder")
    public void statusUnGuncellenebildiginiKontrolEder() {

        String[] statusType = {"UNAPPROVED, DISCHARGED, STILL, STAYING, CANCELLED"};
        Select inPatientStatus =new Select(physicianPage.inPatientEditStatus);

        List<WebElement> status = inPatientStatus.getOptions();
        for (WebElement condition:status) {
            boolean match = false;
            for (int i=0; i<statusType.length; i++){
                if (condition.getText().equals(statusType[i])){
                    match = true;
                }
            }
            Assert.assertTrue(match);

        }

    }


    @And("In Patient butonuna tiklar")
    public void inPatientButonunaTiklar() {
        physicianPage.inPatientButton.click();
        Driver.wait(2);
    }

    @Given("Doktor yatan hasta icin uygun bir oda secer")
    public void doktorYatanHastaIcinUygunBirOdaSecer() {

        Select select=new Select(physicianPage.editInPatientRoom);
        select.selectByIndex(6);
    }

    @And("Doktor save butonuna basar")
    public void doktorSaveButonunaBasar() {
        physicianPage.inPatientSaveButton.click();
    }

    @Then("odanin guncellendigini test eder")
    public void odaninGuncellendiginiTestEder() {
        Assert.assertTrue(physicianPage.updatedMessage.isDisplayed());
    }
    @And("doktor kullanici adini ve sifresini girer")
    public void doktorKullaniciAdiniVeSifresiniGirer() {

        mainPage.username.sendKeys(ConfigReader.getProperty("asa"));
        mainPage.password.sendKeys(ConfigReader.getProperty("123456"));

        Driver.wait(2);

    }
}

