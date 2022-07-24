package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.MedunnaMainPage;
import pages.MedunnaStaffPage;

public class US009 {
    MedunnaMainPage mainPage=new MedunnaMainPage();
    MedunnaStaffPage staffPage=new MedunnaStaffPage();

    @And("Staff olarak giris yapar")
    public void staffOlarakGirisYapar() {
        mainPage.SignIn.click();

    }

    @And("My Pages sekmesine tiklar")
    public void myPagesSekmesineTiklar() {
    }

    @And("Search patient sekmesine tiklar")
    public void searchPatientSekmesineTiklar() {
    }

    @Then("Hasta bilgilerini gorebildigini test eder")
    public void hastaBilgileriniGorebildiginiTestEder() {
    }
}
