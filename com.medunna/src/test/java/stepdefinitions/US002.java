package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.MedunnaMainPage;
import pages.MedunnaRegisterPage;
import pojo.Register;
import pojo.ResponseActual;
import utilities.DBUtils;
import utilities.Driver;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static utilities.Authentication.tokenGenerate;


public class US002 {
    Register registerExpected = new Register(); // expected Data
    Response response;
    Faker faker = new Faker();
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaRegisterPage registerPage = new MedunnaRegisterPage();


    @And("tarayiciyi kapatir.")
    public void tarayiciyiKapatir() {
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





    @Given("Kullanici bilgileri icin parametre olusturulur.")
    public void kullaniciBilgileriIcinParametreOlusturulur() {
        String email = faker.internet().emailAddress(); // rastgele mail adresi olusacak.
        String firstName= faker.name().firstName();
        String lastName = faker.name().lastName();
        String login = firstName+"_"+lastName;
        String password = faker.internet().password(8,12,true,true,true);
        String ssn = faker.idNumber().ssnValid();// xxx-xx-xxxx

        registerExpected.setEmail(email);
        registerExpected.setFirstName(firstName);
        registerExpected.setLastName(lastName);
        registerExpected.setLogin(login);
        registerExpected.setPassword(password);
        registerExpected.setSsn(ssn);




    }

    @Given("Kullanici bilgileri icin post request gonderilir.")
    public void kullaniciBilgileriIcinPostRequestGonderilir() {
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer "+ tokenGenerate())
                .body(registerExpected).when()
                .post("https://medunna.com/api/register");


    }

    @Then("Kullanici adi ve Email dogrulanir.")
    public void kullaniciAdiVeEmailDogrulanir() {
        ResponseActual actualData =response.as(ResponseActual.class);

        Assert.assertEquals(registerExpected.getLogin().toLowerCase(),actualData.getLogin());
        Assert.assertEquals(registerExpected.getEmail(),actualData.getEmail());



    }

    @Given("kullanici DB ile baglanti kurar")
    public void kullaniciDBIleBaglantiKurar() {
        DBUtils.createConnection();
    }

    @And("kullanıcı sorguyu DB'ye gönderir ve {string} oturum açma ile kullanıcı verilerini alır")
    public void kullanıcıSorguyuDBYeGönderirVeOturumAçmaIleKullanıcıVerileriniAlır(String ssn) {
        String query = "select * from jhi_user where ssn=\'" + ssn + "\'";
        registrantMap.putAll(DBUtils.getRowMap(query));
        System.out.println("registrantMap = " + registrantMap);

    }
    Map<String, Object> registrantMap = new HashMap<String, Object>();

    @Then("DB ile {string} dogrulamasi yapilir")
    public void dbIleDogrulamasiYapilir(String email) {
        Map<String,Object>expectedData=new HashMap<>();
        expectedData.put("email",email);
        Assert.assertTrue(registrantMap.entrySet().containsAll(expectedData.entrySet()));

    }
}