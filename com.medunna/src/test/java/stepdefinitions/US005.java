package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.MedunnaMainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US005 {
    MedunnaMainPage mainPage=new MedunnaMainPage();

    @Given("Medunna ana sayfasina gider")
    public void medunna_ana_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @Given("First name kutusuna uygun isim girer")
    public void first_name_kutusuna_uygun_isim_girer() {

    }

    @Then("hata mesajinin cikmadigini test eder")
    public void hata_mesajinin_cikmadigini_test_eder() {

    }

    @Then("tarayiciyi kapatir")
    public void tarayiciyi_kapatir() {
    }

}
