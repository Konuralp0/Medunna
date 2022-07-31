package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaMainPage;
import utilities.Driver;

public class US025 {
    MedunnaMainPage mainPage=new MedunnaMainPage();

    @Then("Send an appointment request butonuna tiklar")
    public void send_an_appointment_request_butonuna_tiklar() {
        mainPage.sendAppointmentRequestButton.click();

    }

    @Then("Appointment kaydinin basarili oldugunu dogrular")
    public void appointment_kaydinin_basarili_oldugunu_dogrular() {
        Driver.wait(1);
        Assert.assertTrue( mainPage.isAppointmentSuccessful.isDisplayed());


    }
}
