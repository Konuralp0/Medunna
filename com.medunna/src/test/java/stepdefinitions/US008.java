package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.Color;
import pages.MedunnaMainPage;
import pages.MedunnaRegisterPage;
import utilities.ConfigReader;
import utilities.Driver;
import pages.MedunnaUserPage;
public class US008 {
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaRegisterPage registerPage = new MedunnaRegisterPage();
    MedunnaUserPage userPage = new MedunnaUserPage();
    @Given("Medunna Ana sayfasina gider")
    public void medunnaAnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }

    @And("Anasayfada giris ikonuna tiklar")
    public void anasayfadaGirisIkonunaTiklar() {
        mainPage.signInRegister.click();
        Driver.wait(2);
    }

    @And("Sign in Secenegini Secer")
    public void signInSeceneginiSecer() {
        mainPage.signIn.click();
        Driver.wait(1);
    }


    @And("Kullanici Adini ve Sifresini girer")
    public void kullaniciAdiniVeSifresiniGirer() {
        mainPage.username.sendKeys(ConfigReader.getProperty("user1") + Keys.TAB);
        mainPage.password.sendKeys(ConfigReader.getProperty("user1pass"));
        Driver.wait(1);
    }

    @And("Sign in Butonuna tiklar")
    public void signInButonunaTiklar() {
        mainPage.sigInButton.click();
        Driver.wait(1);
    }

    @And("Kullanici Adina tiklar")
    public void kullaniciAdinaTiklar() {
        userPage.user.click();
    }

    @And("Password sekmesini secer")
    public void passwordSekmesiniSecer() {
        userPage.current_pass.click();
    }

    @And("Mevcut sifreyi girer")
    public void mevcutSifreyiGirer() {
        userPage.current_pass.sendKeys(ConfigReader.getProperty("user1pass")+ Keys.TAB);
    }

    @And("New password yerine iki harfli ilk harfi büyük bir sifre girer")
    public void newPasswordYerineIkiHarfliIlkHarfiBuyukBirSifreGirer() {
        userPage.new_password.sendKeys(ConfigReader.getProperty("We"));
    }

    @And("herhangi bir rakam girer")
    public void herhangiBirRakamGirer() {
        userPage.new_password.sendKeys(ConfigReader.getProperty("1"));
        Driver.wait(2);
    }

    @Then("Strength Barin bir arttgini Test eder")
    public void strengthBarinBirArttginiTestEder() {
        String expectedikinciBarColor = "#00ff00";
        String ikinciBarColor =  userPage.strengthikinciBar.getCssValue("background-color");
        String hexColor = Color.fromString(ikinciBarColor).asHex();

        Assert.assertEquals(hexColor,expectedikinciBarColor);
        Driver.wait(2);
    }

    @And("Ozel bir karakter girer")
    public void ozelBirKarakterGirer() {
        userPage.new_password.sendKeys(ConfigReader.getProperty("!") + Keys.TAB);
        Driver.wait(2);
    }

    @Then("Strengt Barin bir defa daha arttgini test eder")
    public void strengtBarinBirDefaDahaArttginiTestEder() {
        String expecteducuncuBarColor = "#00ff00";
        String ucuncuBarColor =  userPage.strengthucuncuBar.getCssValue("background-color");
        String hexColor = Color.fromString(ucuncuBarColor).asHex();

        Assert.assertEquals(hexColor,expecteducuncuBarColor);
        Driver.wait(2);
    }

    @And("New password confirmation girer")
    public void newPasswordConfirmationGirer() {
        userPage.new_password.sendKeys(ConfigReader.getProperty("We1!"));
        Driver.wait(2);
    }

    @And("Save Butonuna tiklar")
    public void saveButonunaTiklar() {
        userPage.save_Button.click();
    }

    @Then("sifrenin degistigini test eder")
    public void sifreninDegistiginiTestEder() {
    }

    @And("Save butonuna tekrar tiklar")
    public void saveButonunaTekrarTiklar() {
    }

    @Then("eski sifrenin kullanilamayacagini test eder")
    public void eskiSifreninKullanilamayacaginiTestEder() {
    }

    @And("Tarayiciyi kapatir")
    public void tarayiciyiKapatir() {
    }
}
