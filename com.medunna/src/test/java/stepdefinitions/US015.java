package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaAdminItemsAndTitles;
import pages.MedunnaCreatePatientPage;
import pages.MedunnaMainPage;
import pojo.RequestPatient;
import pojo.RequestPatientResponse;
import pojo.RequestPatientResponseItem;
import utilities.Authentication;
import utilities.ConfigReader;

public class US015 {

    MedunnaMainPage mainPage = new MedunnaMainPage();
    MedunnaCreatePatientPage medunnaCreatePatientPage = new MedunnaCreatePatientPage();
    MedunnaAdminItemsAndTitles medunnaAdminItemsAndTitles = new MedunnaAdminItemsAndTitles();


    @Then("Kullanici admin toollarinin olmadigini test eder")
    public void kullaniciAdminToollarininOlmadiginiTestEder() {
        Assert.assertFalse(isPresent(mainPage.administration));
    }

    @And("admin username ve sifresini girer")
    public void adminUsernameVeSifresiniGirer() {
        mainPage.signIn.click();
        mainPage.username.sendKeys(ConfigReader.getProperty("adminUsername"));
        mainPage.password.sendKeys(ConfigReader.getProperty("adminPassword"));
        mainPage.sigInButton.click();
    }

    @And("admin items ve titles a tiklar")
    public void adminItemsVeTitlesATiklar() {
        mainPage.itemsAndTitles.click();
    }

    @Then("Patient i secer")
    public void patientISecer() {
        mainPage.patient.click();
    }

    @And("Bilgilerini gorebildigini dogrular")
    public void bilgileriniGorebildiginiDogrular(){
        Assert.assertTrue(medunnaAdminItemsAndTitles.sSN.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.iD.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.firstName.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.lastName.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.birthDate.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.phone.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.email.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.gender.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.bloodGroup.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.address.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.description.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.createdDate.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.user.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.country.isDisplayed());
        Assert.assertTrue(medunnaAdminItemsAndTitles.state.isDisplayed());
    }

    @And("yeni bir hasta olustura tiklar")
    public void yeniBirHastaOlusturaTiklar() {
        medunnaAdminItemsAndTitles.createANewPatient.click();

    }

    @Then("yeni hastanin bilgilerini girer")
    public void yeniHastaninBilgileriniGirer() {
        medunnaCreatePatientPage.firstName.sendKeys(Faker.instance().name().firstName());
        medunnaCreatePatientPage.lastName.sendKeys(Faker.instance().name().lastName());
        medunnaCreatePatientPage.yourEmail.sendKeys(Faker.instance().internet().emailAddress());
        medunnaCreatePatientPage.phone.sendKeys(Faker.instance().phoneNumber().cellPhone());
        medunnaCreatePatientPage.address.sendKeys(Faker.instance().address().fullAddress());
    }

    @And("Country USA secer ve eyaletinde acilan dropdowndan secer")
    public void countryUSASecerVeEyaletindeAcilanDropdowndanSecer() {

        Select selectCountry = new Select(medunnaCreatePatientPage.countryName);
        selectCountry.selectByVisibleText("USA");
        Select selectState = new Select(medunnaCreatePatientPage.stateCityName);
        selectState.selectByIndex(0);
    }

    @And("Delete seceginin basilabilir oldugunu test eder")
    public void deleteSecegininBasilabilirOldugunuTestEder() {
        Assert.assertTrue(medunnaAdminItemsAndTitles.deleteButton.isEnabled());
    }

    RequestPatient requestPatient = new RequestPatient();
    Faker faker = new Faker();
    Response response;
    @Given("Kullanici bir hasta icin data olusturur")
    public void kullaniciBirHastaIcinDataOlusturur() {
        requestPatient.setAdress(faker.address().fullAddress());
        requestPatient.setBirthDate(faker.date().birthday().toString());
        requestPatient.setBloodGroup(faker.name().bloodGroup());
        requestPatient.setCountry(faker.country().name());
        requestPatient.setEmail(faker.internet().emailAddress());
        requestPatient.setPhone(faker.phoneNumber().cellPhone());
        requestPatient.setGender(faker.dog().gender());

    }

    @And("Olusturdugu hastayi post request ile gonderir")
    public void olusturduguHastayiPostRequestIleGonderir() {
        response = RestAssured.given()
                .contentType(ContentType.JSON)
                .header("Authorization","Bearer "+ Authentication.tokenGenerate())
                .body(requestPatient).when()
                .post("https://medunna.com/api/patients");
    }

    @Then("Kullanici hastayi dogrular")
    public void kullaniciHastayiDogrular() {
        RequestPatientResponseItem requestPatientResponse = response.as(RequestPatientResponseItem.class);
        Assert.assertEquals(requestPatient.getFirstName(),requestPatientResponse.getFirstName());

    }




    public boolean isPresent(WebElement element){
        try {
            element.isDisplayed();
            return true;
        }catch (NoSuchElementException e){
            return false;
        }


    }
}
