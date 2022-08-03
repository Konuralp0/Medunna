package stepdefinitions;

import com.beust.ah.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.MedunnaAppointmentPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US023 {
    MedunnaAppointmentPage medunnaAppointmentPage = new MedunnaAppointmentPage();

    @And("Onceden tedavisi biten hastasini bulur ve show appointmentsa tiklar")
    public void oncedenTedavisiBitenHastasiniBulurVeShowAppointmentsaTiklar() {
        medunnaAppointmentPage.ssnSearchForInvoice.sendKeys(ConfigReader.getProperty("PatientSSN"));
        Driver.wait(2);
        medunnaAppointmentPage.showAppointmentsFor3555.click();

    }
    @And("Payment Invoice Processesin tiklanabilir oldugunu test eder ve tiklar")
    public void paymentInvoiceProcessesinTiklanabilirOldugunuTestEderVeTiklar() {
        Assert.assertTrue(medunnaAppointmentPage.payment.isEnabled());
        medunnaAppointmentPage.payment.click();
    }
    @And("Examfee ve toplam tutarin gorulebildigini test eder")
    public void examfeeVeToplamTutarinGorulebildiginiTestEder() {
        Assert.assertTrue(medunnaAppointmentPage.examFee.isDisplayed());
        Assert.assertTrue(medunnaAppointmentPage.totalCost.isDisplayed());

    }

    @Then("Create Invoice tiklanabilir oldugunu test eder")
    public void createInvoiceTiklanabilirOldugunuTestEder() {
        Assert.assertTrue(medunnaAppointmentPage.createInvoiceButton.isEnabled());
    }


    @And("Odemesi tamamlanmis olan eski hastayi bulur ve appointmentsa tiklar")
    public void odemesiTamamlanmisOlanEskiHastayiBulurVeAppointmentsaTiklar() {
        medunnaAppointmentPage.ssnSearchForInvoice.sendKeys(ConfigReader.getProperty("completedPatientSSN"));
        Driver.wait(2);
        medunnaAppointmentPage.showAppointments.click();
    }



    @Then("show invoice in tiklanabilir oldugunu test eder")
    public void showInvoiceInTiklanabilirOldugunuTestEder() {
        Driver.wait(2);
        Assert.assertTrue(medunnaAppointmentPage.showInvoice.isEnabled());
        
    }

    @And("show invoice a tiklar")
    public void showInvoiceATiklar() {
        JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();
        executor.executeScript("arguments[0].click();",medunnaAppointmentPage.showInvoice);
    }


    @Then("invoice sayfasinda oldugunu ve gorebildigini test eder")
    public void invoiceSayfasindaOldugunuVeGorebildiginiTestEder() {
        String url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.medunna.com/invoice-show/153510",url);
        Assert.assertTrue(medunnaAppointmentPage.invoiceShownCost.isDisplayed());
        Assert.assertTrue(medunnaAppointmentPage.invoiceShownName.isDisplayed());


    }
}
