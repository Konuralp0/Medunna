
package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MedunnaMainPage;
import utilities.Driver;


public class US006 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    @And("Kullanici menusu butonuna tiklar")
    public void kullaniciMenusuButonunaTiklar() {
        mainPage.accountMenu.click();
        Driver.wait(2);

    }

    @And("Settings butonuna tiklar")
    public void settingsButonunaTiklar() {
        mainPage.userSettings.click();
        Driver.wait(2);
    }

    @Then("Kullanici bilgilerinin dogrulugunu test eder")
    public void kullaniciBilgilerininDogrulugunuTestEder() {
        String userFirstNameText= mainPage.firstName.getText();
        Assert.assertEquals("info", userFirstNameText);
        String userLastNameText= mainPage.lastName.getText();
        Assert.assertEquals("tech", userLastNameText);
        String userEmailText= mainPage.email.getText();
        Assert.assertEquals("infotech@medunna.com", userEmailText);

    }
    @And("Save butonuna tiklar")
    public void saveButonunaTiklar() {
        mainPage.userSettingsSave.click();

    }

    @Then("Firstname, lastname ve Email guncelleme seceneginin oldugunu kontrol eder")
    public void firstnameLastnameVeEmailGuncellemeSecenegininOldugunuKontrolEder() {
        Assert.assertTrue(mainPage.userDatesUpdatedVerification.isDisplayed());


    }






}