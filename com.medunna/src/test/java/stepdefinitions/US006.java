
package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
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
        Assert.assertEquals("cok", userFirstNameText);
        String userLastNameText= mainPage.lastName.getText();
        Assert.assertEquals("hasta", userLastNameText);
        String userEmailText= mainPage.email.getText();
        Assert.assertEquals("hsta@mail.com", userEmailText);

    }
    @And("User Settings Save butonuna tiklar")
    public void UserSettingsSaveButonunaTiklar() {
        mainPage.userSettingsSave.click();

    }

    @Then("Firstname, lastname ve Email guncelleme seceneginin oldugunu kontrol eder")
    public void firstnameLastnameVeEmailGuncellemeSecenegininOldugunuKontrolEder() {
        Assert.assertTrue(mainPage.userDatesUpdatedVerification.isDisplayed());


    }


    @And("kullanici adini {string} ve sifresini {string} girer")
    public void kullaniciAdiniVeSifresiniGirer(String username, String password) {
        mainPage.signIn.click();
        Driver.wait(2);
        mainPage.username.sendKeys(username+ Keys.ENTER);
        mainPage.password.sendKeys(password+Keys.ENTER);

    }

    @And("sign in butonu ile giris yapar")
    public void signInButonuIleGirisYapar() {
        Driver.wait(2);
        mainPage.accountMenu.click();
        mainPage.signIn.click();
        Driver.wait(2);
    }
}