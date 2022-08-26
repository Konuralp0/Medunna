package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.Color;
import pages.MedunnaMainPage;
import utilities.ConfigReader;
import utilities.Driver;
import pages.MedunnaUserPasswordPage;
import static utilities.ConfigReader.properties;

public class US008 {
    MedunnaMainPage mainPage = new MedunnaMainPage();

    MedunnaUserPasswordPage userPage = new MedunnaUserPasswordPage();

    /*@Given("Medunna Ana sayfasina gider")
    public void medunnaAnaSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("medunnaUrl"));
    }*/

    @And("Anasayfada giris ikonuna tiklar")
    public void anasayfadaGirisIkonunaTiklar() {
        mainPage.signInRegister.click();
        Driver.wait(3);
    }
    @And("Sign in secenegini secer")
    public void sign_InSeceneginiSecer() {
        mainPage.signIn.click();
        Driver.wait(3);
    }
    @And("Kullanici Adini ve Sifresini girer")
    public void kullaniciAdiniVeSifresiniGirer() {
        mainPage.username.sendKeys(ConfigReader.getProperty("user1") + Keys.TAB);
        mainPage.password.sendKeys(ConfigReader.getProperty("user1pass"));
        Driver.wait(3);
    }

    @And("Sign in Butonuna tiklar")
    public void signInButonunaTiklar() {
        mainPage.sigInButton.click();
        Driver.wait(3);
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
        Driver.wait(3);
    }
    @And("New password yerine bes harfli ilk harfi buyuk bir sifre girer")
    public void newPasswordYerineBesHarfliIlkHarfiBuyukBirSifreGirer() {
        userPage.new_password.sendKeys(ConfigReader.getProperty("Wertz"));
    }
    @And("herhangi bir rakam girer")
    public void herhangiBirRakamGirer() {
        userPage.new_password.sendKeys(ConfigReader.getProperty("2"));
        Driver.wait(2);
    }
    @Then("Strength Barin bir arttigini Test eder")
    public void strengthBarinBirArttiginiTestEder() {
        String expectedikinciBarColor = "#00ff00";
        String ikinciBarColor =  userPage.strengthikinciBar.getCssValue("background-color");
        String hexColor = Color.fromString(ikinciBarColor).asHex();

        Assert.assertEquals(hexColor,expectedikinciBarColor);
        Driver.wait(2);
    }
    @And("Ozel bir karakter girer")
    public void ozelBirKarakterGirer() {
        userPage.new_password.sendKeys(ConfigReader.getProperty("?") + Keys.TAB);
        Driver.wait(2);
    }
    @Then("Strengt Barin bir defa daha arttigini test eder")
    public void strengtBarinBirDefaDahaArttiginiTestEder() {
        String expecteducuncuBarColor = "#00ff00";
        String ucuncuBarColor =  userPage.strengthucuncuBar.getCssValue("background-color");
        String hexColor = Color.fromString(ucuncuBarColor).asHex();

        Assert.assertEquals(hexColor,expecteducuncuBarColor);
        Driver.wait(2);
    }
    @And("New password confirmation girer")
    public void newPasswordConfirmationGirer() {
        userPage.confirmPassword.sendKeys(ConfigReader.getProperty("Wertz2?"));
        Driver.wait(2);
    }

    @Then("New Passwordun confirme oldugunu test eder")
    public void newPasswordunConfirmeOldugunuTestEder() {
        try {
                Assert.assertFalse("password confirm", userPage.confirme_Uyari.isDisplayed());
                System.out.println("password confirm");

            } catch (NoSuchElementException e) {
                System.out.println("no confirm..");
            }
        Driver.wait(2);
    }
    @Then("eski sifrenin kullanilamayacagini test eder")
    public void eskiSifreninKullanilamayacaginiTestEder() {
        String confirm1password = "Wertz1!";
        if(confirm1password.equalsIgnoreCase(properties.getProperty("user1pass"))){
            userPage.confirmPassword.clear();
            userPage.confirmPassword.click();
            Driver.wait(2);
            userPage.confirmPassword.sendKeys(confirm1password);
            Assert.assertTrue("password not confirm", userPage.confirme_Uyari.isDisplayed());
            System.out.println("eski sifre kullanilamiyor");
        }
        else{


        //String user1pass;

        System.out.println("password confirm");
        }
    }
    @And("Tarayiciyi kapatir")
    public void tarayiciyiKapatir() {
    }


}
