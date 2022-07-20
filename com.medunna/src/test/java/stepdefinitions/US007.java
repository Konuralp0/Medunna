package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.it.Date;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import pages.MedunnaMainPage;
import utilities.Driver;


import java.time.format.DateTimeFormatter;

public class US007 {

    MedunnaMainPage page = new MedunnaMainPage();
    @And("make an appointmenta tiklar")
    public void makeAnAppointmentaTiklar() {
        page.makeAnAppointment.click();
        Driver.wait(2);
    }

    @Then("Appointment Datetimeda verilen tarih bugune esitligini test eder")
    public void appointmentDatetimedaVerilenTarihBuguneEsitliginiTestEder() {
   // DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");
     // String currentDateStr = dtf.format(java.time.LocalDate.now());


        Assert.assertEquals(LocalDate.now().toString(), page.appoDate.getDomProperty("value"));
        Driver.wait(2);


    }

    @And("Gun yerine bir gun oncesinin tarihini yazar")
    public void gunYerineBirGunOncesininTarihiniYazar() {

        page.appoDate.sendKeys(LocalDate.now().minusDays(1).toString().substring(0,2));
        Driver.wait(2);


    }

    @Then("Uyari verdigini test eder")
    public void uyariVerdiginiTestEder() {
        Assert.assertTrue(page.appointmentDateCanNotBePa.isDisplayed());
        Driver.wait(2);

    }

    @And("Gun yerine bugunun tarihinin bir sonrasini yazar")
    public void gunYerineBugununTarihininBirSonrasiniYazar() {
        page.appoDate.sendKeys(LocalDate.now().plusDays(1).toString().substring(0,2));
        Driver.wait(2);

    }

    @Then("Uyarinin kalktigini test eder")
    public void uyarininKalktiginiTestEder() {

        Assert.assertFalse(isPresent(page.appointmentDateCanNotBePa));
    }

    @And("Ay yerine bir ay oncesinin tarihini yazar")
    public void ayYerineBirAyOncesininTarihiniYazar() {

    }

    @And("Ay yerine bu ayin tarihini yazar")
    public void ayYerineBuAyinTarihiniYazar() {
    }

    @And("Yil yerine eski bir yil yazar")
    public void yilYerineEskiBirYilYazar() {
    }

    @And("Yil yerine bir sonraki yilin tarihini yazar")
    public void yilYerineBirSonrakiYilinTarihiniYazar() {
    }

    @Then("Tarihin gun ay yil olarak yazildigini test eder")
    public void tarihinGunAyYilOlarakYazildiginiTestEder() {
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
