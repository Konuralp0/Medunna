package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaAppointmentPage;
import pages.MedunnaMainPage;
import pages.MedunnaPhysicianPage;

import java.util.List;

public class US014 {
    MedunnaMainPage mainPage=new MedunnaMainPage();
    MedunnaPhysicianPage physicianPage=new MedunnaPhysicianPage();
    MedunnaAppointmentPage appointmentPage=new MedunnaAppointmentPage();
    @And("View butonuna tiklar")
    public void viewButonunaTiklar() {
        appointmentPage.appointmentViewButton.click();

    }

    @Then(value = "istenilen bilgilerin goruntulendigini kontrol eder")
    public void istenilenBilgilerinGoruntulendiginiKontrolEder() {

        Assert.assertTrue(appointmentPage.appointmentIDView.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentStartDateView.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentEndDateView.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentDescriptionView.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentCreateDateView.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentStatusView.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentPatientView.isDisplayed());

    }

    @And("Edit butonuna tiklar")
    public void editButonunaTiklar() {
        appointmentPage.appointmentEditButton.click();
    }

    @Then("istenilen bilgilerin guncellenebildigini kontrol eder")
    public void istenilenBilgilerinGuncellenebildiginiKontrolEder() {
        Assert.assertTrue(appointmentPage.appointmentIDEdit.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentStartDateEdit.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentEndDateEdit.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentDescriptionEdit.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentStatusEdit.isDisplayed());
        Assert.assertTrue(appointmentPage.appointmentEPatientEdit.isDisplayed());

    }

    @Then("Status un guncellenebildigini kontrol eder")
    public void statusUnGuncellenebildiginiKontrolEder() {

        String[] statusType = {"UNAPPROVED, DISCHARGED, STILL, STAYING, CANCELLED"};
        Select appointmentStatus =new Select(appointmentPage.appointmentStatusEdit);

        List<WebElement> status = appointmentStatus.getOptions();
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



}

