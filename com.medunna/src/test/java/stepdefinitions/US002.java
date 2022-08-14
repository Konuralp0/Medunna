package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaMainPage;
import pages.MedunnaRegisterPage;
import utilities.Driver;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.tokenGenerate;


public class US002 {
    Faker faker = new Faker();
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaRegisterPage registerPage = new MedunnaRegisterPage();
    Response response;

    @And("tarayiciyi kapatir.")
    public void tarayiciyiKapatir() {
    }

    @And("Username kutusuna tiklar.")
    public void usernameKutusunaTiklar() {
        Driver.wait(2);
        registerPage.registerusername.click();
        Driver.wait(2);
    }
    @And("Email kutusuna tiklar.")
    public void emailKutusunaTiklar() {
        registerPage.email.click();
        Driver.wait(1);
    }
    @Then("Username gerekli yazdigini test eder.")
    public void usernameGerekliYazdiginiTestEder() {
        String beksonuc = "Your username is required.";
        String gersonuc = registerPage.usernameVerification.getText();
        org.junit.Assert.assertEquals(beksonuc,gersonuc);
        Driver.wait(2);
    }
    @And("Username kutusuna herhangi bir karakter girer ve tab tusuna basar")
    public void usernameKutusunaHerhangiBirKarakterGirerveTabTusunaBasar() {
        mainPage.username.sendKeys(faker.random().toString());
        Driver.wait(1);
        mainPage.email.click();
    }
    @Then("Username kutusunun altinda hata mesaji cikmadigini kontrol eder.")
    public void usernameKutusununAltindaHataMesajiCikmadiginiKontrolEder() {
        boolean assertionFlag = true;
        try {
            registerPage.usernameVerification.isDisplayed();
        } catch (Exception e) {
            assertionFlag = false;
        }
        Assert.assertFalse(assertionFlag);
        Driver.wait(1);
    }
    @And("Email kutusuna {string} ve {string} karakterleri olmadan karakterler girer.")
    public void emailKutusunaVeKarakterleriOlmadanKarakterlerGirer(String arg0, String arg1) {
        Driver.wait(1);
        registerPage.email.sendKeys(faker.random().toString());
        registerPage.newPassword.click();
    }
    @And("New password kutusuna tiklar")
    public void newPasswordKutusunaTiklar() {
        registerPage.newPassword.click();
        Driver.wait(1);
    }
    @Then("Email kutusunun altinda uygun bir Email istendiginin yazdigini test eder.")
    public void emailKutusununAltindaUygunBirEmailIstendigininYazdiginiTestEder() {
        String beksonuc = "This field is invalid";
        String gersonuc = registerPage.emailVerification.getText();
        org.junit.Assert.assertEquals(beksonuc,gersonuc);
        Driver.wait(1);
    }
    @Then("Email kutusunun altinda email gerekli yazdigini test eder.")
    public void emailKutusununAltindaEmailGerekliYazdiginiTestEder() {
        String beksonuc = "Your email is required.";
        String gersonuc = registerPage.emailVerification.getText();
        org.junit.Assert.assertEquals(beksonuc,gersonuc);
        Driver.wait(1);
    }


    @Given("Kullanici bilgileri icin request gonderilir.")
    public void kullaniciBilgileriIcinRequestGonderilir() {
        response= given().headers(
                "Authorization","Bearer "+ tokenGenerate(),
                "Content-Type", ContentType.JSON,
                "Accept",ContentType.JSON
        ).when().get("https://medunna.com/api/appointments?=size=10000");


    }

    @Then("Status kodunun {int} oldugunu test eder")
    public void statusKodununOldugunuTestEder(int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }

    @And("kullanıcı adı {string} api tarafından doğrulanmalıdır")
    public void kullanıcıAdıApiTarafındanDoğrulanmalıdır(String string) {
        //string= readFile(ConfigurationReader.getProperty("US_002_applicant_data"));
        String[] registrantData= string.split("'");

        String username= registrantData[7];

        response.then().assertThat().body("login",hasItem(username.toLowerCase()));

    }
}