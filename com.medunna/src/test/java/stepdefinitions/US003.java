package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.Color;

import pages.MedunnaMainPage;
import pages.MedunnaRegisterPage;
import utilities.Driver;

import static java.lang.Thread.sleep;

public class US003 {



    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaRegisterPage registerPage = new MedunnaRegisterPage();


    @And("anasayfada giris ikonuna tiklar")
    public void anasayfadaGirisIkonunaTiklar() {

        mainPage.signInRegister.click();
        Driver.wait(2);
    }

    @And("Register butonuna tiklar")
    public void registerButonunaTiklar() {
        registerPage.register.click();
        Driver.wait(2);
    }

    @And("New password yerine dort harfli ilk harfi buyuk bir sifre girer")
    public void newPasswordYerineDortHarfliIlkHarfiBuyukBirSifreGirer() {
        registerPage.newPassword.sendKeys("Admi");
    }


    @And("uc kucuk harf daha girer")
    public void ucKucukHarfDahaGirer() {
        registerPage.newPassword.sendKeys("nnn");
        Driver.wait(2);
    }

    @Then("Strength barin bir arttgini test eder")
    public void strengthBarinBirArttginiTestEder() {
        String expectedSecondBarColor = "#ff9900";
        String secondBarColor =  registerPage.strengthSecondBar.getCssValue("background-color");
        String hexColor = Color.fromString(secondBarColor).asHex();

        Assert.assertEquals(hexColor,expectedSecondBarColor);
        Driver.wait(2);



    }

    @And("bir tane rakam girer")
    public void birTaneRakamGirer() {
        registerPage.newPassword.sendKeys("2");
    }

    @Then("Strength barin iki arttigini testeder")
    public void strengthBarinIkiArttiginiTesteder() {
        String expectedFourthBarColor = "#99ff00";
        String fourthBarColor = registerPage.strengthFourthBar.getCssValue("background-color");
        String hexColor = Color.fromString(fourthBarColor).asHex();

        Assert.assertEquals(expectedFourthBarColor,hexColor);

        Driver.wait(2);
    }

    @And("bir ozel karakter girer")
    public void birOzelKarakterGirer() {
        registerPage.newPassword.sendKeys("$");
    }

    @Then("Strengt barin bir defa daha arttgini test eder")
    public void strengtBarinBirDefaDahaArttginiTestEder() {
        String expectedFifthBarColor = "#00ff00";
        String fifthBarColor = registerPage.strengthFifthBar.getCssValue("background-color");
        String hexColor = Color.fromString(fifthBarColor).asHex();

        Assert.assertEquals(expectedFifthBarColor,hexColor);
        Driver.wait(2);
    }
    @And("tarayiciyi kapatir")
    public void tarayiciyiKapatir() {
        Driver.closeDriver();

    }




    }

