package stepdefinitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaAdminItemsAndTitles;
import pages.MedunnaMainPage;
import pages.MedunnaPhysicianPage;
import pojo.Physician;
import utilities.ConfigReader;
import utilities.DBUtils;
import utilities.Driver;

import java.util.HashMap;
import java.util.Map;

import static hooks.Hooks.spec;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.tokenGenerate;


public class US018 {
    private static RequestSpecification spec;
    Map<String, Object> registrantMap = new HashMap<String, Object>();
    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaPhysicianPage physicianPage = new MedunnaPhysicianPage();
    MedunnaAdminItemsAndTitles medunnaAdminItemsAndTitles = new MedunnaAdminItemsAndTitles();

    @And("Physicians menusune giris yapar")
    public void physiciansMenusuneGirisYapar() {
        medunnaAdminItemsAndTitles.physicianButton.click();
        Driver.wait(2);
    }

    @Then("Create a new Physician butonuna tiklar")
    public void createANewPhysicianButonunaTiklar() {
        physicianPage.createNewPhysicianButton.click();
        Driver.wait(2);
    }

    @Given("Use Search kutusunu isaretle")
    public void useSearchKutusunuIsaretle() {
        physicianPage.useSearchCheckBox.click();
        Driver.wait(2);
    }

    @And("Istenilen kisinin SSN kimligini girer")
    public void istenilenKisininSSNKimliginiGirer() {
        physicianPage.searchSSN.sendKeys("321-48-7891");
        Driver.wait(2);
    }

    @And("Search User butonuna tiklar")
    public void searchUserButonunaTiklar() {
        physicianPage.searchUserButton.click();
        Driver.wait(2);
    }

    @Then("Verilerin goruntulendigini kontrol eder")
    public void verilerinGoruntulendiginiKontrolEder() {
        Assert.assertTrue(physicianPage.userFoundAlert.isDisplayed());


    }

    @Given("Speciality butonua tiklar")
    public void specialityButonuaTiklar() {
    }

    @Then("Speciality secebildigini kontrol eder")
    public void specialitySecebildiginiKontrolEder() {
    }

    @Given("Exam fee butonuna tiklar")
    public void examFeeButonunaTiklar() {
    }

    @Then("Exam fee girilebildigini kontrol eder")
    public void examFeeGirilebildiginiKontrolEder() {
    }

    @And("Fotograg yukleme butonuna tiklar")
    public void fotogragYuklemeButonunaTiklar() {
    }

    @Then("Fotograg yuklenebilirligini kontrol eder")
    public void fotogragYuklenebilirliginiKontrolEder() {
    }


    @Then("adi soyadi dogum tarihi vb bilgilerinin oldugunu test eder")
    public void adiSoyadiDogumTarihiVbBilgilerininOldugunuTestEder() {
        Assert.assertTrue(physicianPage.physicianUserName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianLastName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianGender.isDisplayed());
        Assert.assertTrue(physicianPage.physicianSpeciality.isDisplayed());
        Assert.assertTrue(physicianPage.physicianBloodGroup.isDisplayed());
    }

    @And("Speciality menusune tiklar ve bir uzmanlik dali secer")
    public void specialityMenusuneTiklarVeBirUzmanlikDaliSecer() {
        Select slc = new Select(physicianPage.physicianSpeciality);
        slc.selectByVisibleText("Dermatology");

    }

    @Then("secimi kontrol eder")
    public void secimiKontrolEder() {
        Assert.assertTrue(physicianPage.selectedSpeciality.isDisplayed());
    }


    @And("Exam fee ye tiklar Muayene ucreti verisi girer")
    public void examFeeYeTiklarMuayeneUcretiVerisiGirer() {
        physicianPage.physicianExamFee.sendKeys("20");

    }

    @Then("Girildiginin kontrolunu yapar")
    public void girildigininKontrolunuYapar() {
        Assert.assertEquals("20", physicianPage.physicianExamFee.getText());
    }


    @And("image file butonuna tiklar  ve doktor fotografi yukler")
    public void imageFileButonunaTiklarVeDoktorFotografiYukler() {
        physicianPage.physicianImageFileUpload.sendKeys("physicianPhoto.jpg");

    }

    @Then("fotografin yuklendigini test eder")
    public void fotografinYuklendiginiTestEder() {
        Assert.assertTrue(physicianPage.physicianUploadedPhoto.isDisplayed());
    }

    @And("view butonuna tiklar")
    public void viewButonunaTiklar() {
        physicianPage.physiciansViewButton.click();
    }

    @Then("bilgilerin goruntulandigini test eder")
    public void bilgilerinGoruntulandiginiTestEder() {
        Assert.assertTrue(physicianPage.physicianViewName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewLastName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewBirthDate.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewPhone.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewGender.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewBloodGroup.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewAddress.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewSpeciality.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewDescription.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewCreatedDate.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewImage.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewUserName.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewCountry.isDisplayed());
        Assert.assertTrue(physicianPage.physicianViewStateCity.isDisplayed());

    }


    @And("degistirecegi doktor satirinda edit butonuna tiklar")
    public void degistirecegiDoktorSatirindaEditButonunaTiklar() {
        physicianPage.physiciansEditButton.click();
    }

    @And("secilen doktor bilgilerinde degisiklik yapilir")
    public void secilenDoktorBilgilerindeDegisiklikYapilir() {
        physicianPage.physicianEditExamFee.sendKeys("200");
    }

    @And("save butonuna basilir")
    public void saveButonunaBasilir() {
        physicianPage.physicianEditSaveButton.click();

    }

    @Then("guncellemerin yapildigi test edilir")
    public void guncellemerinYapildigiTestEdilir() {
        Assert.assertEquals("200", physicianPage.physicianEditChangedExamFee);
    }

    @Then("secilen doktorun silinebildigini test eder")
    public void secilenDoktorunSilinebildiginiTestEder() {
        Assert.assertTrue(physicianPage.physicianDeleteButton.isEnabled());
    }

    @Given("Admin menusune gider")
    public void adminMenusuneGider() {
        mainPage.administration.click();
    }

    @And("User Management butonuna tiklar")
    public void userManagementButonunaTiklar() {
        mainPage.userManagement.click();
    }

    @And("Kullanicilar arasindan doktor secer")
    public void kullanicilarArasindanDoktorSecer() {
        medunnaAdminItemsAndTitles.userSelectDoctor.click();
    }

    @Then("doktor rolu oldugunu test eder")
    public void doktorRoluOldugunuTestEder() {
        Assert.assertTrue("ROLE_PHYSICIAN", medunnaAdminItemsAndTitles.testRolePhysician.isDisplayed());


    }

    @And("Admin olarak giris yapar")
    public void adminOlarakGirisYapar() {
        mainPage.signInRegister.click();
        mainPage.signIn.click();
        mainPage.username.sendKeys(ConfigReader.getProperty("adminUsername") + Keys.TAB);
        mainPage.password.sendKeys(ConfigReader.getProperty("adminPassword") + Keys.TAB);
        mainPage.sigInButton.click();
        Driver.wait(2);

    }

    static Response response;
    static Physician physician = new Physician();

    public static void main(String[] args) throws JsonProcessingException {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "physicians", "3", "2051");
        // https://www.medunna.com/api/physicians/2051

        response = given().spec(spec)
                .header("Authorization", "Bearer " + tokenGenerate())
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");
        response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Physician actualPhisician = obj.readValue(response.asString(), Physician.class);
        System.out.println("Actual Data: " + actualPhisician);
        Assert.assertEquals("Cemile", actualPhisician.getFirstName());
        Assert.assertEquals("Turkmen", actualPhisician.getLastName());
        Assert.assertEquals(2051, actualPhisician.getId());
        Assert.assertEquals("NUCLEAR_MEDICINE", actualPhisician.getSpeciality());


    }

    @Given("C user enters expected data for phyisician")
    public void c_user_enters_expected_data_for_phyisician() {
        response = given().spec(spec)
                .header("Authorization", "Bearer " + tokenGenerate())
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");
    }


    @Then("API ile kayitlar dogrulanir")
    public void apiIleKayitlarDogrulanir() throws JsonProcessingException {
        response.prettyPrint();
        response.then().statusCode(200);
        ObjectMapper obj = new ObjectMapper();
        Physician actualPhisician = obj.readValue(response.asString(), Physician.class);
        Assert.assertEquals("Cemile", actualPhisician.getFirstName());
        Assert.assertEquals("Turkmen", actualPhisician.getLastName());
        Assert.assertEquals(2051, actualPhisician.getId());
        Assert.assertEquals("NUCLEAR_MEDICINE", actualPhisician.getSpeciality());
    }
    @Given("MKT user creates a connection with db")
    public void mkt_user_creates_a_connection_with_db() {
        DBUtils.createConnection();
    }
    @Given("MKT user sends the query to db and gets the user data with ssn number {string}")
    public void mkt_user_sends_the_query_to_db_and_gets_the_user_data_with_ssn_number(String ssn) {
        String query = "select * from jhi_user where ssn=\'" + ssn + "\'";
        registrantMap.putAll(DBUtils.getRowMap(query));
        System.out.println("registrantMap = " + registrantMap);
    }
    @Then("MKT validates db registrant data  {string}")
    public void mktValidatesDbRegistrantData(String ssn) {
        Map<String, Object> expectedData = new HashMap<String, Object>();
        expectedData.put("ssn", ssn);
        try {
            readAllRegistrantInDBDataMap(expectedData);
            saveRegistrantDataDB(registrantMap);
        }catch (Exception e) {
            System.out.println("data is already in the list");
        }
        Assert.assertTrue(registrantMap.entrySet().containsAll(expectedData.entrySet()));

    }

    private void saveRegistrantDataDB(Map<String, Object> registrantMap) {
    }

    private void readAllRegistrantInDBDataMap(Map<String, Object> expectedData) {
    }
    @Given("C User set the path params for phyisician")
    public void c_user_set_the_path_params_for_phyisician() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "physicians","3","2051");

    }

    @Given("Path parametreleri belirlenir")
    public void pathParametreleriBelirlenir() {
        spec = new RequestSpecBuilder().setBaseUri(ConfigReader.getProperty("medunnaUrl")).build();
        spec.pathParams("1", "api", "2", "physicians","3","2051");

    }

    @And("Beklenen veriler girilir")
    public void beklenenVerilerGirilir() {
        response = given().spec(spec)
                .header("Authorization", "Bearer " + tokenGenerate())
                .contentType(ContentType.JSON)
                .when()
                .get("/{1}/{2}/{3}");

    }

    @Given("DB ile baglanti kurulur")
    public void dbIleBaglantiKurulur() {
        DBUtils.createConnection();
    }

    @And("sorguyu db'ye gönderilir ve {string} ssn numarasıyla kullanıcı verileri alinir")
    public void sorguyuDbYeGönderilirVeSsnNumarasıylaKullanıcıVerileriAlinir(String ssn) {
        String query = "select * from jhi_user where ssn=\'" + ssn + "\'";
        registrantMap.putAll(DBUtils.getRowMap(query));
        System.out.println("registrantMap = " + registrantMap);
    }

    @Then("Veriler DB ile dogrulanir {string}")
    public void verilerDBIleDogrulanir(String ssn) {
        Map<String, Object>expectedData = new HashMap<String, Object>();
        expectedData.put("ssn", ssn);
        try {
            readAllRegistrantInDBDataMap(expectedData);
            saveRegistrantDataDB(registrantMap);
        }catch (Exception e) {
            System.out.println("data is already in the list");
        }
        Assert.assertTrue(registrantMap.entrySet().containsAll(expectedData.entrySet()));
    }
}